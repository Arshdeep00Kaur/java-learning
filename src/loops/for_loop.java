package loops;

import java.util.Scanner;

public class for_loop {
    public static void main(String[] args){

        for(int i=0;i<=10;i++){
            System.out.println("Hello for loop");
        }

        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n: ");
        int n=sc.nextInt();
//        for (int i=0;i<=n;i++){
//            sum+=i;
//        }
//        System.out.println("Sum of natural numbers is"+sum);

//        for(int i=0;i<=n;i++){
//            sum+=2*i;
//        }
//        System.out.println("sum of even numbers is : "+sum);

        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}
