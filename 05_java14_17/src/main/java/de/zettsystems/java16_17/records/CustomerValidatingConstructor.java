package de.zettsystems.java16_17.records;

import lombok.NonNull;

public record CustomerValidatingConstructor(@NonNull String name,
                                            boolean vip, byte[] arr) {
    public CustomerValidatingConstructor(String name) {
        this(name, false, null);
    }

//    public CustomerValidatingConstructor {
//        Objects.requireNonNull(name);
//    }
}
