package de.zettsystems.java9_10.misc;

public class RunVersion {
    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println(version.feature());      // z. B. 11
        System.out.println(version.interim());      // z. B. 0
        System.out.println(version.update());       // z. B. 2 (wenn es 11.0.2 ist)
        System.out.println(version.patch());        // Patch (selten genutzt)
        System.out.println(version.build().orElseThrow());        // Build (selten genutzt)
    }
}
