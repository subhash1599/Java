//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        // int number=System.in.read();
        // System.out.println(number-48); #  
        // InputStreamReader in=new InputStreamReader(System.in);
        // BufferedReader br=new BufferedReader(in); //older way of reading
        // int n=Integer.parseInt(br.readLine());


        // System.out.println(n);

        // br.close(); //good practice to close resources



        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        sc.close();

    }
}
