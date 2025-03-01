package de.zettsystems.java9_10.misc;

import java.util.stream.Collectors;

public class StackWalkerJava9Example {
    public static void main(String[] args) {
        new StackWalkerJava9Example().methodA();
    }

    void methodA() {
        methodB();
    }

    void methodB() {
        methodC();
    }

    void methodC() {
        // StackWalker instanzieren
        StackWalker walker = StackWalker.getInstance();

        // 1) Kompletten Stack ausgeben
        System.out.println("Kompletter Stack:");
        walker.forEach(frame -> {
            System.out.println("  " + frame.getClassName() + "#" + frame.getMethodName());
        });

    }
}
