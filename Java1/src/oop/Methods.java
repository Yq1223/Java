public class Methods{
    public static void main(String[] args){
        Person ming = new Person();
        ming.setName(" ");
        ming.setAge(20);
        System.out.println(ming.getName() + "," + ming.getAge());
    }
}

class Person{
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip();
    }

    public int getAge(){
        return this.age = age;
    }

    public void setAge(int age){
        if (age<0 || age>100){
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }
}
