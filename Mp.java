import java.util.HashMap;
import java.util.Map;

public class Mp {

    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("navin", 56);
        students.put("Harsh", 23);
        students.put("Sushi", 67);
        students.put("Kiran", 92);
        students.put("navin", 1);

        // System.out.println(students);
        // System.out.println(students.get("Sushi"));

        System.out.println(students.keySet());

        for (String key : students.keySet()) {
            System.out.println(key + ":" + students.get(key));

        }
    }
}
