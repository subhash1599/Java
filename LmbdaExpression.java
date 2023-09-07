@FunctionalInterface
interface G{
    void show(int i);
}


public class LmbdaExpression {
    public static void main(String[] args) {
        
        // G obj=new G() {
            
        //     public void show(){
        //         System.out.println("Inside show");
        //     }
        // };

        // G obj =(int i) ->{
        //     System.out.println("Inside Lambda"+" "+i);

        // };

        G obj =i ->{
            System.out.println("Inside Lambda"+": "+i);
        };
        obj.show(6);
    }    
}
