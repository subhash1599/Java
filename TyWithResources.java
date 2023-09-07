import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TyWithResources {
    public static void main(String[] args) throws IOException {
        
        // int i=0;
        // int j=0;

        // try {
            
        //     j=24/i;
        //     System.out.println("Bye");

        // }
        // catch(Exception e){
        //     System.out.println("Something Went Wrong");
        // }
        // finally{
        //     System.out.println("Finally Block Here Bye!!!");
        // }


        // int num=0;
        // BufferedReader br=null;
        // try{
        //     InputStreamReader in=new InputStreamReader(System.in);
        //     br=new BufferedReader(in);
        //     num=Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }
        // finally{
        //     br.close();
        // }

        int num=0;
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){ //creating object in try itself so advantage is resource will be closed automatically
            num=Integer.parseInt(br.readLine());
            System.out.println(num);
        }

        




    }
}
