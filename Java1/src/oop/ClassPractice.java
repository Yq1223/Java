public class ClassPractice{
    public static void main(String[] args){
        class City{  //定义一个名为City的类
            public String name;   // 类里面包含一个叫name的字符型字段
            public double latitude;
            public double longitude;
        }

        City hz = new City();  // 创建一个叫hz的实例

        hz.name = "hangzhou";
        hz.latitude = 39.903;
        hz.longitude = 116.401;

        System.out.println(hz.name);
        System.out.println("location:" + hz.latitude + "," + hz.longitude);

    }
}