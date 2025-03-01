package de.zettsystems.uebung913;

public class OldStringMethods {
    public static void main(String[] args) {
        String multiLine = " Hallo \n \n Welt!  \n";
        
        // Manuelles Trimmen + Check auf Leerzeilen
        for (String line : multiLine.split("\n")) {
            line = line.trim();
            if (line.isEmpty()) {
                continue;
            }
            System.out.println(line);
        }
    }
}
