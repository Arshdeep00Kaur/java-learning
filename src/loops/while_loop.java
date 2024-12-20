package loops;

import java.util.Scanner;

public class while_loop {
    public static void main(String[] args){
        int i=0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("have learnt: ");
        Boolean haveLearnt = sc.nextBoolean();

        while(!haveLearnt){

            if(haveLearnt==false){
                System.out.println("Go to school");
            }

            System.out.println("Have learnt");
            haveLearnt = sc.nextBoolean();


       }
        System.out.println("Welldone");
    }
}
