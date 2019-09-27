import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in) ;
        System.out.print("Input your height:");
        double Height = scanner.nextDouble();
        System.out.print("Input your weight:");
        float Weight = scanner.nextFloat();
        double BMI = Weight / (Height * Height);
        System.out.print(BMI);
        if (BMI > 32){
            System.out.print("Very fat!");
        }else if(BMI > 28 && BMI <=32){
            System.out.print("Obesity!");
        }else if(BMI > 25 && BMI <= 28){
            System.out.print("overweight!");
        }else if(BMI > 18.5 && BMI <= 25){
            System.out.print("normal");
        }else {
            System.out.print("Over light!");
        }
    }
}