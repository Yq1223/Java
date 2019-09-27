public class RepeatPractice{
    public static void main(String[] args){
        Person ming = new Person();
        Person hong = new Person();
        ming.setName("xiao ming");
        hong.setName("xiao","hong");
    }
}


class Person{
    String name;
    int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public Person(){
        System.out.println("Yanyan");
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
        System.out.println(this.name);
    }

    public void setName(String name1,String name2){
        System.out.println(name1 + "," + name2);
    }

}