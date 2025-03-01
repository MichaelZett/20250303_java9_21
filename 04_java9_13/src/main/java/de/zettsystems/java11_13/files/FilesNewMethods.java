package de.zettsystems.java11_13.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesNewMethods {
    public static void main(String[] args) throws IOException {
        showMismatch();
    }

    /**
     * Files.writeString, Files.readString, Files.mismatch
     */
    public static void showMismatch() throws IOException {
        Path filePath1 = Files.createTempFile("file1", ".txt");
        Path filePath2 = Files.createTempFile("file2", ".txt");
        Files.writeString(filePath1, "Java 12");
        Files.writeString(filePath2, "Java 12");

        String file1Read = Files.readString(filePath1);
        System.out.println("File1: " + file1Read);

        long mismatch = Files.mismatch(filePath1, filePath2);
        System.out.println("Files sind gleich: " + (mismatch == -1L));

        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12");
        Files.writeString(filePath4, "Java 13");

        mismatch = Files.mismatch(filePath3, filePath4);
        System.out.println("Files sind unterschiedlich an Position: " + mismatch);
    }

}
