public class Parameter{
    public static void main(String[] args){
        Person p = new Person();
        int n = 15;
        p.setAge(n);
        System.out.println(p.getAge());
        n = 20;
        System.out.println(p.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}