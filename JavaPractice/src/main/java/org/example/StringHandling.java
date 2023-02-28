package org.example;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StringHandling {
    public static void main(String[] args) {
//        System.out.printf(textBlock());
//        System.out.println(getLineSeparator());
//        System.out.println(stringPlusOperation());
//        System.out.println(stringJoin());
        System.out.println(stringWriter());
    }


    // Java multi line string
    public static String textBlock() {
        return """
                Get busy living
                or
                get busy dying.
                --Stephen King
                """;
    }

    // getting line separator
    public static String getLineSeparator() {
        String newLine = System.getProperty("line.separator");
        return "Hello".concat(newLine).concat("world");
    }

    // string concatenation

    public static String stringPlusOperation() {
        String newLine = System.getProperty("line.separator");
        return "Get busy living"
                +
                newLine
                +
                "or"
                +
                "get busy dying";
    }

    // string join
    // newline is separator
    // other strings are elements
    public static String stringJoin() {
        String newLine = System.getProperty("line.separator");
        return String.join(newLine, "Get busy living", "or", "get busy dying");
    }

    // stringWriter
    public static String stringWriter() {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("Get busy living");
        printWriter.println("or");
        printWriter.println("get busy dying");
        return stringWriter.toString();
    }
}
