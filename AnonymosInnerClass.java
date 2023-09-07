class A{
    public void show(){
        System.out.println("Inside A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("Inside B Show");
    }
}

public class AnonymosInnerClass {
   public static void main(String[] args) {
    
    A obj=new A(){
        public void show(){
            System.out.println("Inside New Show");
        }
    
    };
    obj.show();
    


   } 
}
