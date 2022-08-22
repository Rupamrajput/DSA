package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("C:\\Users\\rupam\\Desktop\\ioInJava\\data.txt"));
            String l;
            while ((l=data.readLine())!=null){
                print(l);
            }
        }
        finally {
            if(data!=null)
                data.close();
        }
    }

    public static void print(String str){
        String[] s = str.split(",");
        System.out.println(s[0]+" "+s[1]+ " "+rot5(s[2])+" "+rot13(s[3]));
    }

    public static String rot5(String str) {
        String[] s = str.split("-");
        String originalDOB = "";
        for (int i = 0; i < 3; i++) {
            String temp = s[i];
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) < '5') {
                    originalDOB += (temp.charAt(j) + 5) - '0';
                } else originalDOB += (temp.charAt(j) - 5) - '0';
            }
            if (i != 2) originalDOB += '-';
        }
        return originalDOB;
    }

    public static String rot13(String s) {
        String originalDOB = "";

        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)!=' '){
                if (s.charAt(j) < 'N') {
                    originalDOB += (char) (s.charAt(j) + 13) ;
                } else originalDOB += (char) (s.charAt(j) - 13) ;
            }
            else originalDOB+=' ';
        }


        return originalDOB;
    }
}
