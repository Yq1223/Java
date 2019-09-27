public class StringFound{
    public static void main(String[] args){
        String str = "Test String";
        int n1 = str.indexOf('t');
        int n2 = str.indexOf("st");
        int n3 = str.indexOf("st",4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
}