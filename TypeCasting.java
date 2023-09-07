class A{
    public void show1(){
        System.out.println("Inside A Show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("Inside B Show");
    }
}


public class TypeCasting {
    public static void main(String[] args) {
        
        // A obj=(A) new B(); //upcasting
        // obj.show1(); 

        // B obj1=(B) obj;
        // obj1.show2();//downcasting

    }
    
}
