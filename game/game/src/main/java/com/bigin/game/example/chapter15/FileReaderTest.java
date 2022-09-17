package com.bigin.game.example.chapter15;

import java.io.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileReaderTest {


        public static void main(String[] args) {
            try {
                FileReader tempFile = new FileReader("c:/IVE_After_LIKE.txt");
                BufferedReader buff = new BufferedReader(tempFile);
                char[] byteBuff = new char[1613];

                int size = buff.read(byteBuff, 0, byteBuff.length); // ??? byte ?? ??..

                String context = new String(byteBuff, 0, size);

                System.out.println("??? :" + size);
                System.out.println("??: \n" + context );

                buff.close(); // ??? ?? ????.
                tempFile.close();
            } catch (Exception e) {
                System.out.println("?? ??? ?? ? ?? ??.");
            }
        }


}
