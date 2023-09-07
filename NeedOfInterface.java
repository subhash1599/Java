// class Computer{

// }

// class Laptop{
//     public void code(){
//         System.out.println("code compile run ");
//     }
// }

// class Desktop{
//     public void code(){
//         System.out.println("code compile run faster");
//     }
// }

// class Developer{
//     public void devApp(Laptop lap){ // tight coupling
//         lap.code();
//     }
// }


// public class NeedOfInterface {
//     public static void main(String[] args) {
        
//         Laptop lap=new Laptop();
//         Desktop des=new Desktop();

//         Developer ram=new Developer();
//         ram.devApp(lap);

//     }
// }

// class Computer{
//     public void code(){

//     }
// abstract class Computer{
//     public abstract void code();
    
// }

interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code compile run ");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code compile run faster");
    }
}

class Developer{
    public void devApp(Computer com){ // loose coupling
        com.code();
    }
}






public class NeedOfInterface {
public static void main(String[] args) {
    Computer lap=new Laptop();
    Computer des=new Desktop();

    Developer ram=new Developer();
    ram.devApp(lap);
    ram.devApp(des);
}
}