package de.zettsystems.java14_15.exercises14_15;

public final class ClothingService {
    private ClothingService() {
        // not intended
    }

    // TODO use new Java api
    public static String decideCloths(Season season) {
        String cloth = "T-SHIRT";
        switch (season) {
            case SPRING:
            case AUTUMN:
                cloth = "PULLOVER";
                break;
            case SUMMER:
                cloth = "T-SHIRT";
                break;
            case WINTER:
                cloth = "JACKET";
                break;
            default:
                throw new IllegalStateException("No such season: " + season);
        }
        return cloth;
    }
}
