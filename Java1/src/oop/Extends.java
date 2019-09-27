public class Extends{
    public static void main(String[] args){
        Person p = new Person();
        Student s = new Student();
        s.setName("xiaoming");
        s.setAge(40);
        s.setScore(100);
    }
}


class Person{
    private String name;
    private int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        System.out.println(name);
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        System.out.println(age);
    }
}


class Student extends Person{
    private int score;

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        System.out.println(score);
    }
}