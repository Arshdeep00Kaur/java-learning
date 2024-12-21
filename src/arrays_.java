public class arrays_ {
    public static void main(String[] args){
//        int age[];//initialization
//        age=new int[5];// allocation
//        age[0]=12;// declaration
//        age[1]=13;
//        System.out.println(age[0]);

//          int age[]=new int[5];  //initialization and allocation in one line
//          age[0]=4;
//          age[1]=3;
//          System.out.println(age[1]);

//        int age[]={10,20,30,40};
//        System.out.println(age[3]);

        // for loop to access each element from array

//        String names[]={"Arsh","Arun","harsh","Aditya"};
//        for (int i=0;i<names.length;i++){
//            System.out.println(names[i]);
//        }

        // but in arrays instead of using for loop use for-each loop

//        for(String name : names){  // read this like for (each name in names) { print name}
//            System.out.println(name);
//        }

        // now solve one problem
        // add each elements present in array
        int numbers[]={12,12,14,15,26,78};
//        int sum=0;
//        for (int i = 0;i<numbers.length;i++){
//            sum+=numbers[i];
//        }
        // or
//        for (int number:numbers){
//            sum+=number;
//        }
//        System.out.println(sum );

        // 2. find minimum number from numbers
        int min = Integer.MAX_VALUE;
        for (int number : numbers){
            if (number<min){
                min=number;
            }
        }
        System.out.println("smallest number is:"+min);
//        3. now find maximum number in numbers
        int max = Integer.MIN_VALUE;
        for (int number : numbers){
            if(number>max){
                max=number;
            }
        }
        System.out.println("maximum no is : "+max);

        // multidimensional array
        //int marks[][]= new int[3][4];
        int marks[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(marks[1][1]);

    }
}
