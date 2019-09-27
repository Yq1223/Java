// 请给Person类增加(String, int)的构造方法：
public class MethodsPractice{
    public static void main(String[] args){
        Person p1 = new Person("xiaoming",23);
        Person p2 = new Person();
        System.out.println(p1.getName() + "," + p1.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name = name;
        this.age = 12;
    }

    public Person(int age){
        this.name = "YY";
        this.age = age;
    }

    public Person(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}