public class Do{
    public static void main(String[] args){
        int n = 20;
        int m = 100;
        int sum = 0;
        do {
            sum = sum + n;
            n++;
        }while (n<=100);
        System.out.println(sum);
    }
}