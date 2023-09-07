public class Switch {
    public static void main(String[] args){
        java.lang.String x="Wed";

        switch(x)
        {
            case "Mon" -> System.out.println("5am");
            case "Tue" -> System.out.println("6am");
            case "Wed" -> System.out.println("7am");
            default -> System.out.println("None");
        }
    }
}
