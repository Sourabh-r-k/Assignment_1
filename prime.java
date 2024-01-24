// Author: Sourabhgouda.R.K
// Program to Print the Prime numbers.
package java2;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int i,count;
        System.out.println("Enter the Range for the 'Prime Numbers':");
        int num=in.nextInt();
        System.out.println("The Prime Numbers between 1 to "+num+" is:");
        for(int j=2;j<=num;j++){
            count=0;
            for (i=1;i<=j;i++){
                if (j%i==0){
                    count++;
                }
            }
            if (count==2){
                System.out.println(j+" ");
            }
        }
    }
}
