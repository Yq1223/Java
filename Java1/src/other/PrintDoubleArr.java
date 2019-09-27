import java.util.Arrays;

public class PrintDoubleArr{
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] arr1 : arr){
            System.out.println(arr1);
            for(int n : arr1){
                System.out.println(n);
            }
        }
    }
}