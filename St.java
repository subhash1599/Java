import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class St {
    
    public static void main(String[] args) {
        Collection<Integer> s=new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(4);
        s.add(2);


        Iterator<Integer> values=s.iterator();
        while(values.hasNext())
            System.out.println(values.next());
        // for (Integer he : s) {
        //     System.out.println(he);
            
        // }


    }
}
