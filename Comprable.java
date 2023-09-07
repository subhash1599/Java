import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{ 

    int age;
    String name;



    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }




    
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }





    




    @Override
    public int compareTo(Student that) {
        if(this.age>that.age)
            return 1;
        else
            return -1;
       
        
    }
    
}







public class Comprable {

    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();
    students.add(new Student(17,"Ajay"));
    students.add(new Student(12,"hari"));
    students.add(new Student(10,"gani"));
     students.add(new Student(14,"mani"));
    Collections.sort(students);
    System.out.println(students);
    }
}
