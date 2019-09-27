public class ExtendsPractice{
    public static void main(String[] args){
        Person p = new Person(new String("小明".getBytes("UTF-8")),12);
        Student s = new Student("小红",20,99);
        PrimaryStudent ps = new PrimaryStudent("小军",9,100,5);
        System.out.println(p.getName());
//        System.out.println(p.getName() + "," + p.getAge() + "," + s.getName() + "," + s.getAge() + "," + s.getScore() + "," + ps.getName() + "," + ps.getAge() + "," + ps.getScore() + "," + ps.getGrade());
//        System.out.println(ps.getGrade());
    }
}


class Person{
    protected String name;
    protected int age;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

}

class Student extends Person{
    protected int score;

    public Student(String name,int age,int score){
        super(name,age);
        this.score = score;
    }

    public int getScore(){
        return this.score;
    }

    public void setScore(int score){
        this.score = score;
    }

}

class PrimaryStudent extends Student{
    protected int grade;

    public PrimaryStudent(String name,int age,int score,int grade){
        super(name,age,score);
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

}