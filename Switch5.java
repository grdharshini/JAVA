import java.util.Scanner;
public class Switch5 {
    public static void main(String [] args){
        String flower;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name");
        flower = scan.nextLine();

        switch(flower){
            case "Sunflower":
                System.out.println("Oil");
                break;
        }

    }
}