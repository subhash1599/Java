public class SpecificException {
    

    public static void main(String[] args) {
        int i=5;
        int j=0;
        int nums[]=new int[5];
        
        try {
            j=20/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
            if (nums.length>4)
                throw new ArrayIndexOutOfBoundsException("Try to access element within the limit");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot Divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Only retrieve elements in specified size");
        }
        System.out.println(j);   
        
    }
}
