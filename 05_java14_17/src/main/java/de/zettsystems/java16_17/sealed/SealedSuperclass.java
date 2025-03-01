package de.zettsystems.java16_17.sealed;


public abstract sealed class SealedSuperclass implements SealedInterface permits NonSealedSubclass, SealedSubclass {

}
