public class ExceptionHandling {

    public static void main(String[] args) {
        
        int i=2;
        int j=0;

        

        try{
            j=18/i;
            if(j==1)
                throw new ArithmeticException("Denominator should not be zero and smaller than numerator");
             
        }
        catch(ArithmeticException e){
            // System.out.println("Shouldnot divide by zero");
            j=18/1;
            System.out.println("thats the default output");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
           

        }

        System.out.println(j);
        System.out.println("Bye");
        
    }
    
}
