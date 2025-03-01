module de.zettsystems.greetingimpl {
    requires de.zettsystems.greeting;

    provides de.zettsystems.greeting.GreetingService with
            de.zettsystems.greetingimpl.GreetingServiceImpl;
}