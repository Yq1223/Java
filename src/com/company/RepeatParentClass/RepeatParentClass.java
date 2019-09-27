package com.company.RepeatParentClass;

public class RepeatParentClass{
    public static void main(String[] args){
        Person p = new Student();
        p.Run();
    }
}


class Person{
    protected String name;
    protected int age;

    public void Run(){
        System.out.println("Person Run!");
    }
}

class Student extends Person{
    @Override
    public void Run(){
        System.out.println("Student Run!");
    }
}