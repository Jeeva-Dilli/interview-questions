package com.file.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReplace {

    public static void main(String[] args) {

        File log = new File("log.txt");
        String search = "textFiles/a.txt";
        String replace = "replaceText/b.txt";

        try {
            FileReader fr = new FileReader(log);
            String s;
            String totalStr = "";
            try (BufferedReader br = new BufferedReader(fr)) {

                while ((s = br.readLine()) != null) {
                    totalStr += s;
                }
                totalStr = totalStr.replaceAll(search, replace);
                FileWriter fw = new FileWriter(log);
                fw.write(totalStr);
                fw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
