package com.bigin.game.example.chapter15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        int data = 0;
        while((data=fileInputStream.read()) != -1){
            fileOutputStream.write(data);
        }

        fileInputStream.close();;
        fileOutputStream.close();
    }
}
