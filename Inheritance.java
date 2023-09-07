public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj=new VeryAdvCalc();
        int r1=obj.add(1, 5);
        int r2=obj.sub(6, 2);
        int r3=obj.mul(2, 9);
        int r4=obj.div(2, 1);
        double r5=obj.power(2, 2);
        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
    }
}
