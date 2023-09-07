
    
    class Calcul{
        int a;
        public int add(int n1,int n2){
            int result=n1+n2;
            return result;
        }
    }
public class Oops {
    public static void main(String[] args) {

        int num1=1;
        int num2=5;
        // int result=n1+n2;

        // System.out.println(result);
        Calcul cal=new Calcul();
        int result=cal.add(num1,num2);
        System.out.println(result);
    }
}
