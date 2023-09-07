class Calci{
    public int add(int a,int b){
        return a+b;
    }

}

class AdvaCalci extends Calci{
    public int add(int a,int b){
        return a+b+1;
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        AdvaCalci obj=new AdvaCalci();
        int r1=obj.add(5, 6);
        System.out.println(r1);
    }
}
