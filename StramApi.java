import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StramApi {
    public static void main(String[] args) {

        // List<Integer> nums=Arrays.asList(1,6,5,7,2,17,4);
        // int sum=0;
        // for(Integer n:nums){
        // if(n%2==0){
        // n=n*2;
        // sum+=n;
        // }
        // }
        // System.out.println(sum);

        List<Integer> nums = Arrays.asList(1, 6, 5, 7, 2, 17, 4);
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);
        int result=s3.reduce(0,(c,e)->c+e);
        //s3.forEach(n -> System.out.println(n));
        System.out.println(result);

    }
}
