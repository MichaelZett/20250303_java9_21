package de.zettsystems.java25_xx.structured;

import java.util.List;

public record Invoice(Issuer issuer, Customer customer, List<Item> items) {
}
