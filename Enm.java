
    enum Status{
        Running,Pending,Failed,Success
    };



public class Enm {
  public static void main(String[] args) {
    Status s=Status.Success;

    if(s==Status.Success)
        System.out.println("Perfect");
    else if(s==Status.Pending)
        System.out.println("Please wait");
    else if(s==Status.Failed)
        System.out.println("Try again");
    else
        System.out.println("Working on it");

    switch(s){
        case Running:
            System.out.println("Working on it");
            break;
        case Pending:
            System.out.println("Working on it");
            break;
        case Failed:
            System.out.println("Working on it");
            break;
        default:
            System.out.println("well done");
    }

    Status sarr[]=Status.values();
    System.out.println(s+" "+s.ordinal());

    for(Status a:sarr){
        System.out.println(a);

    }
  }  
}
