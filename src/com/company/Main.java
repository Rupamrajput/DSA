package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Person> personList = new ArrayList<>();
    public static int firstNameMaxLength = 0;
    public static int secondNameMaxLength = 0;
    public static int DOBMaxLength = 0;
    public static int birthPlaceMaxLength = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader data = null;
        try {
            data = new BufferedReader(new FileReader("C:\\Users\\rupam\\Desktop\\ioInJava\\data.txt"));
            String l;
            String[] line;
            while ((l=data.readLine())!=null){
                line = l.split(",");
                firstNameMaxLength = Math.max(firstNameMaxLength,line[0].length());
                secondNameMaxLength = Math.max(secondNameMaxLength,line[1].length());
                DOBMaxLength = Math.max(DOBMaxLength,line[2].length());
                birthPlaceMaxLength = Math.max(birthPlaceMaxLength,line[3].length());
                personList.add(new Person(line[0],line[1],rot5(line[2]),rot13(line[3])));
            }
            print();
        }
        finally {
            if(data!=null)
                data.close();
        }
    }

    public static void print(){
        //headers
        System.out.print("Name");
        for(int i=0; i<firstNameMaxLength+secondNameMaxLength-1;i++){
            System.out.print(" ");
        }
        System.out.print("Birth Date");
        for(int i=0; i<DOBMaxLength-8;i++){
            System.out.print(" ");
        }
        System.out.println("Birth Place");
        //dot view
        for(int i=0; i<firstNameMaxLength+secondNameMaxLength+1;i++){
            System.out.print("-");
        }
        System.out.print("  ");
        for(int i=0; i<DOBMaxLength;i++){
            System.out.print("-");
        }
        System.out.print("  ");
        for(int i=0; i<birthPlaceMaxLength+1;i++){
            System.out.print("-");
        }
        System.out.println();
        //Person list print
        for(Person p:personList){
            System.out.print(p.getFirstName()+" "+p.getSecondName());
            int l = p.getFirstName().length()+p.getSecondName().length();
            for(int i=0; i<firstNameMaxLength+secondNameMaxLength-l+2;i++){
                System.out.print(" ");
            }
            System.out.print(p.getDOB());
            l=p.getDOB().length();
            for(int i=0; i<DOBMaxLength-l+2;i++){
                System.out.print(" ");
            }
            System.out.println(p.getBirthPlace());
        }
    }

    public static String rot5(String str) {
        String[] s = str.split("-");
        StringBuilder originalDOB = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            String temp = s[i];
            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) < '5') {
                    originalDOB.append((temp.charAt(j) + 5) - '0');
                } else originalDOB.append((temp.charAt(j) - 5) - '0');
            }
            if (i != 2) originalDOB.append('-');
        }
        return originalDOB.toString();
    }

    public static String rot13(String s) {
        StringBuilder placeOfBirth = new StringBuilder();
        for (int j = 0; j < s.length(); j++) {
            if(s.charAt(j)!=' '){
                if (s.charAt(j) < 'N') {
                    placeOfBirth.append((char) (s.charAt(j) + 13));
                } else placeOfBirth.append((char) (s.charAt(j) - 13));
            }
            else placeOfBirth.append(' ');
        }
        return placeOfBirth.toString();
    }
}
