package methods;
public class functions {
    public static  void main(String[] args){
        greet();
        average(2,3);
        int sum_of_number = sum(2,5,true);// as i used int instead of void function is returning somethong therefore i can store that ans in some variable and use it somewhere i want
        int double_sum = (sum_of_number)*2;
        System.out.println(double_sum);

        // there is also a inbuilt method
        // math
        System.out.println(Math.min(2,3));
        System.out.println(Math.max(3,5));
        System.out.println(Math.abs(-5));
    }
    static void greet(){
        System.out.println("hello");
    }
    public static void average(int a,int b){
         int average=(a+b)/2;
         System.out.println("average is"+average);  // as if we use void then we cannot return anything that is we cannot use the average further in main fuction for further calculations , all the variables that are in in void fuction will get terminated from stack memory
    }
    public static int sum(int a, int b, boolean find_sum){
        if (find_sum == false){
             return -1;
        }
        int sum = a+b;
        return sum;
    }
}
