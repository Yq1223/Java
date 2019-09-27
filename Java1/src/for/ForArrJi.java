public class ForArrJi{
    public static void main(String[] args){
        int[] ns = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=1;i<ns.length;i=i+2){
            sum = sum + ns[i];
            System.out.println(i);
        }
        System.out.println(sum);
    }
}