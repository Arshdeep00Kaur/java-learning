package loops;

public class nested_loop {
    public static void main(String[] args){
        // print 1 2 3 4 5 , 10 times
        for(int count=1;count<=10;count++){ // this will inner loop 10 times
            for(int i=1;i<6;i++){ //will print 1 2 3 4 5
                System.out.print(i+" ");
            }
            System.out.println("count is "+count);
        }


    }
}
