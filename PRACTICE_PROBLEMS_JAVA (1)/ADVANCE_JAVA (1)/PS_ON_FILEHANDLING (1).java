package ADVANCE_JAVA;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PS_ON_FILEHANDLING {
    public static void main(String[] args) throws IOException {

        int num = 3;
        String table = "";

        for (int i = 1; i <= 10; i++) {
            table += num + "x" + i + " =" + (num * i);
            table += "\n";
        }

            File myFile = new File("MultiPlication_files.txt");
            try {
                myFile.createNewFile();

            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }

            FileWriter fileWriter = new FileWriter(myFile);
            fileWriter.write(table);
            fileWriter.close();

        }
    }
