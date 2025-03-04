package de.zettsystems.java18_21.solution;

sealed interface Pet permits Dog, Cat, Fish {
    String name();
}

// Aus den Klassen werden Records:
record Dog(String name) implements Pet {}
record Cat(String name) implements Pet {}
record Fish(String name) implements Pet {}
