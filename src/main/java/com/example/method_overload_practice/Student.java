package com.example.method_overload_practice;

public class Student {

    private String name,major,email;
    private double cgpa;


    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setMajor(String major) {
        this.major = major;
        return this;
    }

    public Student setCgpa(double cgpa) {
        this.cgpa = cgpa;
        return this;
    }

    public Student setEmail(String email) {
        this.email = email;
        return this;
    }



    public void display() {
        System.out.println("Student{" +
                "name='" + name + '\'' +
                ", major='" + major + '\'' +
                ", email='" + email + '\'' +
                ", cgpa=" + cgpa +
                '}');
    }


}
