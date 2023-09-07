import java.util.Arrays;
import java.util.List;

public class FrEachMethod {

    public static void main(String[] args) {
        

        List<Integer> nums=Arrays.asList(1,4,5,8);


        //Consumer<Integer> con= n->System.out.println(n);
            

        

        nums.forEach(n->System.out.println(n));

    }
    
}
