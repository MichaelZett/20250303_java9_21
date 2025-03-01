package de.zettsystems;

import com.thoughtworks.xstream.XStream;

public class XStreamReflectionProblem {

    public static void main(String[] args) {
        // Einfache Klasse mit privaten final Feldern (kein Default-Konstruktor).
        Person person = new Person("Alice", 30);

        // XStream-Instanz
        XStream xstream = new XStream();
        // Seit neueren XStream-Versionen muss man erlaubte Klassen explizit freigeben:
        xstream.allowTypes(new Class[]{Person.class});

        // Serialisieren (zu XML)
        String xml = xstream.toXML(person);
        System.out.println("XML:\n" + xml);

        // Deserialisieren (hier kann Java 17 blocken, 
        // weil XStream intern versucht, private final Felder via Reflection zu setzen)
        Person fromXml = (Person) xstream.fromXML(xml);
        System.out.println("Deserialized object: " + fromXml);
    }
}

// Separate Klasse mit final Feldern und ohne Default-Konstruktor
class Person {
    private final String name;
    private final int age;

    // Kein Default-Konstruktor, XStream versucht, per Reflection die Felder zu befüllen
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='%s', age=%d}".formatted(name, age);
    }
}
