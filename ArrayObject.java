class Student{
    java.lang.String name;
    int rollno;
    int marks;
}

public class ArrayObject {
   public static void main(String[] args) {
    
    Student s1=new Student();
    s1.name="ram";
    s1.rollno=12;
    s1.marks=456;

    Student s2=new Student();
    s2.name="doll";
    s2.rollno=13;
    s2.marks=567;

    Student s3=new Student();
    s3.name="sandya";
    s3.rollno=14;
    s3.marks=123;

    Student students[]=new Student[3];
    students[0]=s1;
    students[1]=s2;
    students[2]=s3;

    for (int i = 0; i < students.length; i++) {
        System.out.println(students[i].name);
    }

   } 
}
