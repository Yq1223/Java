public class Break{
    public static void main(String[] args){
        int sum = 0;
        for (int i=0;;i++){
            sum = sum + i;
            if (i == 100){
                break;
            }
        }
        System.out.println(sum);
    }
}