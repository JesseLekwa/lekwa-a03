package baseline;


public class Solution30 {
    public static void main(String args[]){
        int rows = 12, cols = 12;//function for number of rows and columns
        System.out.print("\t");
        System.out.print("|\t");
        for(int i = 1;i<=cols;i++){
            System.out.print(i + "\t");
        }
        System.out.println("\n------------------------------------------------------");// print statement for rows
        for(int i = 1;i<=rows;i++){
            System.out.print(i + "\t");
            System.out.print("|\t");//print statement for columns
            for(int j = 1;j<=cols;j++){
                System.out.print((i*j) + "\t");
            }
            System.out.println();
        }
    }
}
