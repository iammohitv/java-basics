import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        System.out.println("In Input");
        Scanner mv = new Scanner(System.in);
        System.out.println("Enter Num1");
        int a = mv.nextInt();
        System.out.println("Enter Num2");
        float b = mv.nextFloat();
        System.out.println(a+b);
    }
}
