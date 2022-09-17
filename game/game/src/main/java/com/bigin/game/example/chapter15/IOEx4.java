package com.bigin.game.example.chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx4 {
    public static void main(String[] args) throws IOException {
        byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
        byte[] outSrc = null;
        byte[] temp = new byte[4];

        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;

        input = new ByteArrayInputStream(inSrc);
        output = new ByteArrayOutputStream();

        while(input.available() > 0) {
            int len = input.read(); // ?? ??? ??
            output.write(temp, 0, len); // ?? ??? write
        }

        outSrc = output.toByteArray();
        System.out.println("input : " + Arrays.toString(inSrc));
        System.out.println("temp : " + Arrays.toString(temp));
        System.out.println("output : " + Arrays.toString(outSrc));

    }
}
