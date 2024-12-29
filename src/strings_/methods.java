package strings_;

public class methods {
    public static void main(String[] args){
        // methods --> 1. toUpperCase()
//        2. toLowerCase()
//        3. trim()
//    4. startsWith()
//    5. endsWith()
//    6. equals()
//    7. equalsIgnoreCase()
//    8. charAt()
//    9.valueOf()
//    10.replace()
//    11. contains()
//    12. substring()
//    13. split()
//    14. toCharArray()
//    15. isEmpty()

        String name =" today THE weather is very beautiful";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("  heloooo  ".trim()); // it will trim spaces from back and front of string
        System.out.println(name.startsWith(" today"));
        System.out.println(name.endsWith("ful"));
        System.out.println(name.equals("beautiful"));
        System.out.println(name.equalsIgnoreCase("today the weather is very beautiful"));
        System.out.println(name.charAt(4)); // use to check value at index

        int age =22;
        String stringage= String.valueOf(age); // it will change it to string
        System.out.println(stringage);

        String sentence = " i love java";
        System.out.println(sentence.replace("java","python"));

        System.out.println(sentence.contains("python"));

        System.out.println(sentence.substring(2,5));
        System.out.println(sentence.substring(1));// also called method overloading

        System.out.println(sentence.split(" "));
        String words[] = name.split(" ");
        for(String word: words){
            System.out.println(word);
        }

        String colour= "brown";
        char letters[] = colour.toCharArray();
        for(char letter : letters){
            System.out.println(letter);
        }

        String animal="";
        if(animal.isEmpty()){ // checks string is empty
            System.out.println("empty ");
        }
        String animals = "    ";
        if(animals.isBlank()){
            System.out.println(animals.isBlank()); // it will return true, it checks spaces
        }
    }
}
