// Author: Sourabhgouda.R.K
// Program to find the biggest of the 3 given Numbers.
package java2;
import java.util.Scanner;
public class big {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the 3 numbers to check which is 'Biggest'");
        System.out.print("Enter the 1 number: ");
        int num1=in.nextInt();
        System.out.print("Enter the 2 number: ");
        int num2=in.nextInt();
        System.out.print("Enter the 3 number: ");
        int num3=in.nextInt();
        if(num1>num2 & num1>num3){
            System.out.println("The 'Biggest' is : "+num1);
        } else if (num2>num1 & num2>num3) {
            System.out.println("The 'Biggest' is : "+num2);
        }else {
            System.out.println("The 'Biggest' is : "+num3);
        }
        System.out.println("Thank you!");
    }
}
