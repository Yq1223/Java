import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;
import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Field{
    public static void main(String[] args){
        Person3 ming = new Person3("xiaoming",12,99);
        Person3 hong = new Person3("xiaohong", 20,100);
        Person3.number = 1;
        System.out.println(hong.number);
        hong.number = 3;
        System.out.println(Person3.number);
    }
}


class Person3{
    public String name;
    public int age;
    public static int number;  // 定义静态字段
    public Person3(String name,int age,int number){
        this.name = name;
        this.age = age;
        this.number = number;
    }
}