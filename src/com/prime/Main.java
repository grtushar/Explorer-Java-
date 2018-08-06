package com.prime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\Golam Rahman Tushar\\Desktop\\abc.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        fw.write("asdfasdfasdfasfasdfasdf");
        fw.write(" second string ");
        fw.append(" hello worldasdfasdf");
        fw.close();

        FileReader fr = null;
        fr = new FileReader("C:\\Users\\Golam Rahman Tushar\\Desktop\\abc.txt");
        BufferedReader br = new BufferedReader(fr);

        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }
        fr.close();
    }
}
