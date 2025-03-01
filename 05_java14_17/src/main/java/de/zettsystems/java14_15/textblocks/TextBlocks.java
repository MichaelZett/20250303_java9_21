package de.zettsystems.java14_15.textblocks;

public class TextBlocks {

    public static void main(String[] args) {
        System.out.println(getSimpleTextBlock());
        System.out.println("*****_New_*****");
        System.out.println(getBlockOfHtml());
        System.out.println("*****_Old_*****");
        System.out.println(getBlockOfHtmlOldschool());
        System.out.println(getFormattedText("Wert"));
        System.out.println(getIgnoredNewLines());
        System.out.println(printABackslashLines());
        System.out.println(doNotPreserveTrailingWhitespace());
        System.out.println(preserveTrailingWhitespace());
    }

    private static String getSimpleTextBlock() {
        String textBlock = """
                Example text""";
        return textBlock;
    }

    public static String getBlockOfHtml() {
        return """
                <html>
                    
                    <body>
                        <span>example text</span>
                    </body>
                </html>
                """;
    }

    public static String getBlockOfHtmlOldschool() {
        return "<html>\n"
                + "\n"
                + "    <body>\n"
                + "        <span>example text</span>\n"
                + "    </body>\n"
                + "</html>";
    }

    public static String getFormattedText(String parameter) {
        String.format("Ein Parameter: %s", parameter);// ist jetzt discouraged, man möge mit .formatted arbeiten
        "Ein Parameter: %s".formatted(parameter);
        return """
                Ein Parameter: %s
                """.formatted(parameter);
    }

    public static String getIgnoredNewLines() {
        return """
                This is a long text which looks to \
                have a newline but actually does not""";
    }

    public static String printABackslashLines() {
        return """
                This is a long text which looks to \\
                have a newline and has it""";
    }

    public static String doNotPreserveTrailingWhitespace() {
        String colors = """
                red  
                green
                blue 
                """;
        return colors;
    }

    public static String preserveTrailingWhitespace() {
        String colors = """
                red \s
                green
                blue\s
                """;
        return colors;
    }

}
