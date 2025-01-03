package oopss_;

public class method_overloading {
    public static void main(String[] args){
        Greet obj1 = new Greet();
        obj1.greet();
        obj1.greet("Arsh");
        obj1.greet("arun",5);
    }
}

class Greet{

    void greet(){
        System.out.println("Hello, Good morning");
    }

    void greet(String name){
        System.out.println("Hello,"+name+"Good morning");
    }

    void greet(String name, int count){
        for (int i=0;i<=count;i++){
            System.out.println("hello"+name+"Good morning");
        }
    }
}
