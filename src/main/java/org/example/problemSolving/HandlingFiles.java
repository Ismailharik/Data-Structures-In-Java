package org.example.problemSolving;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandlingFiles {

    public void Files() {
        try {
            File myFile = new File("fileTest1.txt");
            FileWriter fileWriter = new FileWriter(myFile);
            Scanner scanner= new Scanner(myFile);

            if (myFile.createNewFile()) {
                System.out.println("fileTest.txt created");
            }else{
                System.out.println("file already exist");
            }
            fileWriter.write("Files in Java might be tricky, but it is fun enough!");
            fileWriter.close();
            int i=0;
            while (scanner.hasNextLine()){
                String data = scanner.next();
                System.out.println(++i+"-----"+data);
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        HandlingFiles handlingFiles = new HandlingFiles();
        handlingFiles.Files();

    }
}
