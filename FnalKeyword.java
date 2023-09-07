/*final */
 class Calco{
    public /*final */ void show(){
        System.out.println("By Ram");
    }
}

class AdvaCalco extends Calco{

    public void show(){
        System.out.println("Override method");
    }

}



public class FnalKeyword {
public static void main(String[] args) {
    
    final int x=1;
    
    System.out.println(x);

    AdvaCalco obj=new AdvaCalco();
    obj.show();

}
    
    
}
