public class CreateClass{
    public static void main(String[] args){
        class Person{
            public String name;
            public int age;
        };
        class Book{
            public String name;
            public String author;
            public String isbn;
            public double price;
        }


        Person ming = new Person();
        Book book = new Book();

        ming.name = "xiaoming";
        ming.age = 12;
        System.out.println(ming.name);


    }
}