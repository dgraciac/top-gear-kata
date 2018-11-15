package com.codurance.top_gear_kata;

import java.io.*;

public class Console {
    public void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.flush();
    }
}