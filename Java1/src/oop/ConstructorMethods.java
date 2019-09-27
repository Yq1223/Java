public class ConstructorMethods{
    public static void main(String[] args){
        Person p = new Person("xiaoming",23);
        System.out.println(p.getName() + "," + p.getAge());
    }
}

class Person{
    private String name;
    private int age;

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