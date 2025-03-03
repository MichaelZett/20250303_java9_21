package de.zettsystems.java9_10.localtypeinf;

public class TestImport {
    public static void main(String[] args) {
        // für var brauch man den Import nicht
        var customers = LocalTypeInference.executeQuery("");
    }
}
