//请按倒序遍历数组并打印每个元素：
public class ArrPractice{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i=arr.length-1;i>=0;i--){
            System.out.print("," + arr[i]);
        }
    }
}