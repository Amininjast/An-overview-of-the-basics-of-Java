package com.amininjast;

import java.io.File;
import java.io.IOException;

public class WorkWithFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/amin.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
