public class WrapperClass {

    public static void main(String[] args) {
        
    
    int num=5;
    //Integer n=new Integer(num) #boxing
    Integer n=num; //autoboxing

    int num1=n.intValue();//unboxing
    // int num1=n; #auto-unboxing 
    System.out.println(n+num1);

    String s="12";
    int k=Integer.parseInt(s);
    System.out.println(k*12);


    }
}
