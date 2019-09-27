public class StaticMethods{
    public static void main(String[] args){
        Person4.setNumber(1000);
        System.out.println(Person4.number);
    }
}


class Person4 {
    public static int number;
    public static void setNumber(int value){
        number = value;
    }
}