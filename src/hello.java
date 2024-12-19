public class hello{
    public static void main(String[] args){
        System.out.println("hello wordkjahsdkjhasjdhld");
        System.out.println(5*10);
        int age=20;
        System.out.println(age);
        // we can do type conversion implicitly and explicitly in both ways
        // imlicitly: whrn converting from smaller to greater byte-> short->int->double
        double age_double= age;
        //explicitly: reverse of implicit
        int marks= 79;
        byte marks_byte=(byte)marks;
        System.out.println(marks_byte);
        float number = 12.5f; // we cannot write 12.5 alone because it will be double
        System.out.println(number);
    }
}