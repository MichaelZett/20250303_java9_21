package de.zettsystems.java18_21.solution;

public class PetCare {

    public static String suggestActivity(Pet pet) {
        // Pattern Matching mit Record Pattern im Switch
        return switch (pet) {
            case Dog(String name) -> "Take " + name + " for a walk";
            case Cat(String name) -> "Play with " + name + " and a laser pointer";
            case Fish(String name) -> "Watch " + name + " swim around";
        };
    }

    public static void main(String[] args) {
        // Erzeugen der Instanzen
        Pet dog  = new Dog("Buddy");
        Pet cat  = new Cat("Whiskers");
        Pet fish = new Fish("Nemo");

        // Ausgabe
        System.out.println(suggestActivity(dog));
        System.out.println(suggestActivity(cat));
        System.out.println(suggestActivity(fish));
    }
}
