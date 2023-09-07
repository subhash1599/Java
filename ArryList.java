import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArryList {
    public static void main(String[] args) {
        Collection<Integer> nums=new ArrayList<Integer>();
        // Mention type with the help of generics here 
        // This <Integer> <type> helps to remove bugs from the code
        nums.add(1);
        nums.add(9);
        nums.add(9);

        
        for (int n : nums) {
            System.out.println(n);
            
        }

        // in case we need index definitely in that case there is no point to use collection we need to use List instead.
        List<Integer> nl=new ArrayList<>();
        nl.add(1);
        nl.add(7);
        nl.add(4);

        System.out.println(nl.get(2));



        System.out.println(nums);
    }
}
