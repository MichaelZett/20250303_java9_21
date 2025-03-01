package de.zettsystems.java16_17.records;

/**
 * Die Attribute sind private final. Die Zugriffmethoden heißen (leider) wie die Attribute, d.h. nicht nach JavaBean
 * Konvention getX() sondern x().
 * Es gibt Hashcode, Equals und toString mit allen Attributen.
 */
public record Customer(String name, boolean vip) {

}
