class A{
    public void show(){
        System.out.println("Inside A Show");
    }

}

class B extends A{
    public void show(){
        System.out.println("Inside B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("Inside C show");
    }

}



public class DynamicMethodDispatch {
    public static void main(String[] args) {
        
        A obj=new A();
        obj.show();

        obj=new B();
        obj.show();

        obj=new C();
        obj.show();

        //obj.show() is behaving differently with different objects we are not sure when obj.show() call which method of which class it will be decided at runtime and thats what it is called dynamic method dispatch.(only works with inheritance)
    }
}
