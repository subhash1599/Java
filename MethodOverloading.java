class Calculator{

    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class MethodOverloading {
    
public static void main(String[] args) {
    Calculator cal=new Calculator();
    int r=cal.add(1,2,15);
    System.out.println(r);
}
}