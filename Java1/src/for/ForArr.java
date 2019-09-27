public class ForArr{
    public static void main(String[] args){
        int[] ns = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i=0;i<ns.length;i++){
            sum = sum + ns[i];
        }
        System.out.println(sum);
    }
}