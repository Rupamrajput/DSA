package com.company;

public class Person {
    String firstName;
    String SecondName;
    String DOB;
    String BirthPlace;

    public Person(String firstName, String secondName, String DOB, String birthPlace) {
        this.firstName = firstName;
        SecondName = secondName;
        this.DOB = DOB;
        BirthPlace = birthPlace;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getBirthPlace() {
        return BirthPlace;
    }

}