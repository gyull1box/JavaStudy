package com.bigin.game.example.chapter16;

import java.net.URL;
import java.net.URLConnection;

public class NetworkEx3 {
    public static void main(String args[]) throws Exception{
        URL url = null;
        String address = "https://school.programmers.co.kr/learn/challenges";

        try {
            url = new URL(address);
            URLConnection conn = url.openConnection();

            System.out.println("conn.toStrign" + conn);
            System.out.println("conn.getAllowUserInteraction :" + conn.getAllowUserInteraction());
            System.out.println("conn.getConnectTimeout :" + conn.getConnectTimeout());
            System.out.println("conn.getContent :" + conn.getContent());
            System.out.println("conn.getDefaultPort: " + conn.getContentEncoding());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
