interface D{

    int add(int i,int j);

}



public class LmbdaExpressReturn {

    public static void main(String[] args) {
        
    
    // D obj=new D() {
    //     public int add(int i,int j){
    //         return i+j;
    //     }
    // };

    D obj= (i,j) -> i+j;
    
    int result=obj.add(1,2);
    System.out.println(result);
}

}