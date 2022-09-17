package com.bigin.game.example.chapter15;
import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamTest {
    public static void main(String[] args) {
        try {
            FileInputStream tempFile = new FileInputStream("c:/IVE_After_LIKE.txt");
            BufferedInputStream buff = new BufferedInputStream(tempFile);
            byte[] byteBuff = new byte[9999];
            int size = buff.read(byteBuff); // ??? byte ??

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

