interface A{
    String name="Ram";
    String dream="USA";

    void show();
    void config();
}

class B implements A{
    public void show(){
        System.out.println("Inside Show");
    }

    public void config(){
        System.out.println("Inside the config");
    }
}





public class Interface {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.config();
        obj.show();
        System.out.println(A.name);
        System.out.println(A.dream);
    }
}
