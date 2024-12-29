package strings_;

public class string_basics {
    public static void main(String[] args){
        // structure of string is like: we have heap inside it we have string pool
        // String is non primitive , non primitive datatypes are made by premitive

        String name = "Aaruu";       // this is more efficient method
        String sameName = "Aaruu";    // it will create memory for same value only one time that will store in string pool
                                      // as we are just changing the name it will simply change the reference

        String newName = new String("Aaruu");  // it will create new memory for each value in heap , here newName is reference
                                                       // if we create new reference name it will create new memory and store Aaruu again

        if (name == sameName){
            System.out.println("name and newName are equal");
        }

        if(name == newName){
            System.out.println("name and newName are equal");   // not equal because == checks references not values . As name -> Aaruu stored in string pool
                                                                // newName -> Aaruu stored in heap, this is all because string is non premitive
        }
        else{
            System.out.println("not equal");
        }


        // to check equal values we have method name as equals()
        if(name.equals(newName)){
            System.out.println("name and newName have equal values");
        }

        // we also have one more method name as equalsIgnoreCase() , it ignores the upper and lower cases
        if(name.equalsIgnoreCase(newName)){
            System.out.println("both have equal values");
        }

    }
}
