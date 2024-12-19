import java.util.Scanner;

public class conditional_statements {
    public static void main(String[] args){
        // if statement
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your age:");
//        int a = sc.nextInt();
//        System.out.println("Your age is:"+a);
//        if (a>=18){
//            System.out.println("you can vote");
//        }
//        else{
//            System.out.println("u cannot vote");
//        }
        System.out.println("enter value of b");
        float b= sc.nextFloat();
        System.out.println("enter value of c");
        float c= sc.nextFloat();
        System.out.println("enter value of d");
        float d= sc.nextFloat();

        if (b<c){
            if (b<d){
                System.out.println("b is smallest");
            }
        }
        else if(c<d){
            System.out.println("c is smallest");
        }
        else{
            System.out.println("d is smallest");
        }

    }
}
