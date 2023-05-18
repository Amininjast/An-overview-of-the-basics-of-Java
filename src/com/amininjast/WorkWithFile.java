package com.amininjast;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WorkWithFile {
    public static void main(String[] args) {
        File file = createFile("src/Amin.txt");
        writeFile(file, true);

    }

    private static void writeFile(File file, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(file, append);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Amin");
            printWriter.println("");
            printWriter.println("INJAST");
            printWriter.flush();
            printWriter.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException(e);
        }
    }
}
