public class ClassAndInterface{
    public static void main(String[] args){
        Person2 p2 = new Person2();

    }
}



// This is class;
class Person2{
    protected String name;
    protected int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}


// This is interface;
interface Student1{
    int score = 0;
    abstract void getName();
}