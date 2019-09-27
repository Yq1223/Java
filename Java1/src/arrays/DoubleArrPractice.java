import java.util.Arrays;

public class DoubleArrPractice{
    public static void main(String[] args){
        int[][] arr = {
            { 82, 90, 91 },
            { 68, 72, 64 },
            { 95, 91, 89 },
            { 67, 52, 60 },
            { 79, 81, 85 },
        };
        int sum = 0;
        int count = 0;
        for(int[] arr0 : arr){
            for (int n : arr0){
                sum = sum + n;
                count ++;
            }
        }
        double average = sum / count;
        System.out.println(average);
        if (Math.abs(average - 77.733333) < 0.000001) {
            System.out.println("测试成功111");
        } else {
            System.out.println("测试失败222");
        }
    }
}