public class Default{
    public static void main(String[] args){
        Person p1 = new Person("xiaoming",23);
        Person p2 = new Person();
        System.out.println(p1.getName() + "," + p1.getAge());
    }
}

class Person{
    private String name = "Gun";
    private int age = 10;

    public Person(){

    }

    public Person(String name,int age){
        this.name = name;
        this.age = age;
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