package com.company.Polymorphic;

import javafx.application.Application;
import javafx.stage.Stage;

public class Polymorphic extends Application {

    public static void main(String[] args) {
        Person p = new Person();
        Student s = new Student();
        p.Run();
        s.Run();
    }


    public void start(Stage primaryStage) {

    }
}


class Person{
    protected String name;
    protected int age;

    public void Run(){
        System.out.println("Person Run!");
    }
}


class Student extends Person {
    protected int score;
    @Override
    public void Run(){
        System.out.println("Student Run!");
    }
}