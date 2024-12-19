import java.util.Scanner;
public class user_input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("your age is: "+age);

        System.out.println("Enter first number: ");
        float n1= sc.nextFloat();
        System.out.println("Enter second number: ");
        float n2 = sc.nextFloat();
        System.out.println("Sum of two numbers is : "+(n1+n2));

    }


}
