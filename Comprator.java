import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



class Student{

    int age;
    String name;



    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }




    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}

public class Comprator {

    public static void main(String[] args) {
        
    
    // Comparator<String> c=new Comparator<String>() {
    //     public int compare(String o1,String o2){
    //         if(o1.length()>o2.length())
    //             return 1;
    //         else
    //             return -1;
    //     }        
    // }; 

    // List<String> l=new ArrayList();
    // l.add("Ravi");
    // l.add("Ram");
    // l.add("shivam");
    // l.add("ja");

    // Collections.sort(l,c);

    // System.out.println(l);

    Comparator<Student> c=new Comparator<Student>() {
        public int compare(Student s1,Student s2){
            if(s1.age>s2.age)
                return 1;
            else
                return -1;
        }        
    }; 


    List<Student> students=new ArrayList<>();
    students.add(new Student(17,"Ajay"));
    students.add(new Student(12,"hari"));
    students.add(new Student(10,"gani"));
     students.add(new Student(14,"mani"));
    Collections.sort(students,c);

    System.out.println(students);

}

}
