//利用for each循环对数组每个元素求和：
public class ForPractice2{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int n : arr){
            sum = sum + n;
        }
        System.out.println(sum);
    }
}