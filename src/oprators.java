public class oprators {
    public static void main(String[] args){
       int a= 10;
       int b=20;

       // arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // Assignment operator
        a+=2;
        System.out.println(a);
        a-=5;
        System.out.println(a);
        a*=b;
        System.out.println(a);

        // increment / decrement operator
        a++;
        b++;
        System.out.println(a);
        System.out.println(b);

        // Relational operators
        System.out.println(a<b);
        System.out.println(a<=b);

        // Logical operators
        boolean firstNumber = 12<5;
        boolean secondNumber = 12>5;
        System.out.println(firstNumber && secondNumber);
        System.out.println(firstNumber || secondNumber);
        System.out.println(!firstNumber );

    }
}
