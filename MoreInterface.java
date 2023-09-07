interface A{
    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    
}

class B implements A,X{

    
    public void show() {
        System.out.println("Inside Show");    
        
    }

    
    public void config() {
            System.out.println("Inside Config");
    }
    
    public void run(){
        System.out.println("Running");
    }
}


public class MoreInterface {
    public static void main(String[] args) {

        A obj;
        obj=new B();
        obj.config();
        obj.show();
        
    }
}
