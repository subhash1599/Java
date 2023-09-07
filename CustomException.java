class RamException extends Exception{

    public RamException(String s){
            super(s);
    }
    

}

public class CustomException {
    public static void main(String[] args) {
        int i=5;
        int j=0;
        try {
            j=24/i;
            if (i==5)
                throw new RamException("i should not be five yaar this is ram rule");
        } 
        catch (RamException r){
            System.out.println("The rams way of handling thing is "+ r);
        }
        catch (Exception e) {
            System.out.println("Something is not right");
        }
        System.out.println("The result is "+j);        
    }
}
