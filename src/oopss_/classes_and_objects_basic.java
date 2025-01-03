package oopss_;

public class classes_and_objects_basic {
    public static void main(String[] args){
        dog obj = new dog();     // creating object store in heap memory
        obj.name="huskey";
        obj.colour="white";
        obj.features();
    }
}

class dog{               // creating class , stored in metaspace
    String name,colour;  // properties

    void features(){     //behaviour
        System.out.println(name+"has 4 legs , two ears and one tail ");
        System.out.println(name+" is of "+colour+" colour");
    }
}
