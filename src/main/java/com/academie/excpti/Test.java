package com.academie.excpti;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

    }

    private static void getRandomDirectory() throws FileNotFoundException {
        Path directory = null;
        try {
            directory = Files.createDirectory(Paths.get("/tmp/"
                    + new Random().nextInt(10)));
        } catch (IOException e) {
            throw new FileNotFoundException("vapor");
        }
        System.out.println(directory);
    }
}
