public class RepeatMethods{
    public static void main(String[] args){
        Hello hello = new Hello("shaziu",2);
        hello.Hello("xiaoming",23);
        hello.Hello(23);
    }
}



class Hello{
    private String name;
    private int age;

    public Hello(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println(this.name + "," + this.age);
    }

    public void Hello(){
        System.out.println("Hello world!");
    }

    public void Hello(String name,int age){
        System.out.println(name + "," + age);
    }

    public void Hello(int age){
        if (age<18){
            System.out.println("Hello");
        }else {
            System.out.println(age);
        }
    }
}