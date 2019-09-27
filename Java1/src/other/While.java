public class While{
    public static void main(String[] args){
        int sum = 0;
        int n = 100;
        int m = 20;
        while (m<=n){
            sum = sum + m;
            m++;
            System.out.println(m);
        }
        System.out.println(sum);
    }
}