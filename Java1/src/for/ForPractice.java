//给定一个数组，请用for循环倒序输出每一个元素：
public class ForPractice{
    public static void main(String[] args){
        int[] ns = {1,2,3,4,5,6,7,8,9,10};
        for (int i=ns.length-1;i>=0;i--){
            System.out.println(ns[i]);
        }
    }
}