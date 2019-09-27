public class Continue{
    public static void main(String[] args){
        int sum = 0;
        for (int i=0;i<=10;i++){
            System.out.println("begin i = " + i);
            if (i % 2 == 0){
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}