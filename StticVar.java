class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand+" :"+price+" :"+name+" :");
    }

    public static void  show1(Mobile obj){
        System.out.println(obj.brand+" :"+obj.price+" :"+name+" :");
    }
}
public class StticVar {
    public static void main(String[] args) {
        Mobile obj1=new Mobile();
        obj1.brand="Redmi";
        obj1.price=1200;
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Lava";
        obj2.price=1100;
        Mobile.name="SmartPhone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
