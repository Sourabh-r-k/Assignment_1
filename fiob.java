// Author: Sourabhgouda.R.K
// Program to Print the Fibonacci numbers.
package java2;
import java.util.Scanner;
public class fiob {
    public static int fi(int n)
    {
        if(n<=1)
            return n;
        else
            return fi(n-1)+fi(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Positive number to generate the Fibonacci numbers: ");
        int num= in.nextInt();
        System.out.println("The Fibonacci numbers from 1 to "+num+" is :");
        for(int i=1;i<=num;i++)
        {
            System.out.println(fi(i));
        }
        System.out.println("Thank you! ");

    }
}
