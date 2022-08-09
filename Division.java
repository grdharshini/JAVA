import java.util.Scanner;

public class Division {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number: ");


        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        scan.close();


        int division = num1/num2;


        System.out.println("Output: "+division);
    }
}
