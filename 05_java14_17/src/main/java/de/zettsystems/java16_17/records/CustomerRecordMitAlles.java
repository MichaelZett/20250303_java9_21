package de.zettsystems.java16_17.records;

import lombok.Getter;

//@Getter wird hier nicht (mehr) unterstützt
public record CustomerRecordMitAlles(String name, @Getter boolean vip) implements Cloneable /*extends geht nicht */{

    // Überschreiben der Accessor geht
    @Override
    public boolean vip() {
        return vip;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }
}
