package de.zettsystems.java24.classfile;

public enum Info {

    CLASS_NAME("HelloJEP457");

    private String className;

    Info(String className){
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}