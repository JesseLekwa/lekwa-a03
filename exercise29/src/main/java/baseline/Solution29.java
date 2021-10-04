package baseline;



import java.util.Scanner;

public class Solution29 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        while(true){

            System.out.println("What is the rate of return? ");// prompt user for input
            input = sc.nextInt();
            System.out.println(input);

            if(input>=1 && input<= 72){
                System.out.println("It will take "+(72 / input)+ " years to double your investment. ");//print statement for amount of years
                break;

            } else {

                System.out.println("0 is not a valid input. ");//print statement for if input is 0

            }
        }

    }

}
