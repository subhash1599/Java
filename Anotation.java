class A{
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Inside A show");
    }
}


class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("Inside B show");        
    }
}

public class Anotation {
    public static void main(String[] args) {
    
        B obj=new B();
        obj.showTheDataWhichBelongsToThisClass();
        

    }

    
    

}
