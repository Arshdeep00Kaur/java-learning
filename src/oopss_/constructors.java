package oopss_;

public class constructors {
    public static void main(String[] args){
        Complex obj = new Complex(2,3);
        Complex obj2 = new Complex(2);
        obj.print();
        obj2.print();
    }
}

// we donot have any data type for complex numbers , therefore creating a class of it
class Complex{
    int a,b;
    public Complex(int real,int imaginary){
        a=real;
        b=imaginary ;

    }
    // same as function overloading we also have constructor overloading
    public Complex(int real){
        a=real;
        b= 0;

    }
    void print(){
        System.out.println(" your number is "+a+"+"+b+"i");
    }

}