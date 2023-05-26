import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        System.out.println("In Ex1");
        Scanner s = new Scanner(System.in);

//        int sum =0;
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Enter Marks of Subject "+ (i+1));
//            int x = s.nextInt();
//            if(x>100){
//                System.out.println("Marks Should be less than or equal to 100");
//                System.exit(0);
//            }
//            sum = sum +x;
//        }
//        System.out.println("Hey student you have scored: " + sum/5f + "% in your exam");
//        System.out.println("Enter Kilometers: ");
//        int a = s.nextInt();
//        System.out.println("Here is the Miles conversion of Above Kms: "+ a*0.621371f);
        System.out.println("Enter an INT: ");
        System.out.println(s.hasNextInt());
    }
}
