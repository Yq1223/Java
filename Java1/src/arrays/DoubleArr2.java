import java.util.Arrays;

public class DoubleArr2{
    public static void main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] arr0 = arr[0];
        System.out.print(arr[0].length);
        System.out.print(Arrays.toString(arr[0]));
    }
}