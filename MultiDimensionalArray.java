public class MultiDimensionalArray {

    public static void main(String[] args) {
        int marr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                marr[i][j]=(int)(Math.random()*100);
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(marr[i][j]+ " ");
            }
            System.out.println();
        }

        for(int n[]:marr){
            for(int m:n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }

    }
    
}

//Drawbacks of Arrays

