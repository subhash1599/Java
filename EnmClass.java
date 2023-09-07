enum Laptop{
    Macbook(2000),XPS(2200),Surface(1500),ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

    
}

public class EnmClass {
    public static void main(String[] args) {
        Laptop lap=Laptop.Macbook;
        System.out.println(lap.getPrice());

        for(Laptop l:Laptop.values()){
            System.out.println(l+" "+l.getPrice());
        }


    }
}
