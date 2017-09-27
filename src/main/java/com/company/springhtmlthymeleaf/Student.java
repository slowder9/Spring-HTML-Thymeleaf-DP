package com.company.springhtmlthymeleaf;

public class Student {
    private String firstName;
    private String lastName;
    private Grade grade;

    public Student(String firstName, String lastName, Grade grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Enum getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
