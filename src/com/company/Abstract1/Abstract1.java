public class Abstract1{
    public static void main(String[] args){
        Student s = new Student();
        s.Run();
    }
}

abstract class Person1{
    public abstract void Run();
}

class Student extends Person1{
    public void Run(){
        System.out.println("我是谁？");
    }
}