package com.amininjast;

import java.io.*;
import java.util.Scanner;

public class WorkWithFile {
    public static void main(String[] args) {
        File file = createFile("src/Amin.txt");
        writeFile(file, true);
        readFile(file);

    }

    private static void readFile(File file) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeFile(File file, boolean append) {
        try (FileWriter fileWriter = new FileWriter(file, append);
             PrintWriter printWriter = new PrintWriter(fileWriter);) {
            printWriter.println("1");
            printWriter.println("2");
            printWriter.println("3");

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
