package de.zettsystems.java25_xx.scoped;

public class Session {
    public final static ScopedValue<User> LOGGED_IN_USER = ScopedValue.newInstance();
}
