package de.zettsystems.java14_15.solution14_15;

public class QueryProvider {

    public String getQuery() {
        // TODO make it more readable
        return """
                SELECT new de.zettsystems.loesung1416.BookAuthorReviewCount(\
                b.title, \
                concat(a.firstName, ' ', a.lastName), \
                size(b.reviews)) \
                FROM Book b JOIN b.author a \
                GROUP BY b.title, a.firstName, a.lastName""";
    }
}
