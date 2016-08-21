import java.util.Scanner;

/**
 * Created by tony on 21/08/2016.
 */
public class EvenEntryLoop {

    public static void main(String[] args) {

        int SENTINEL = 999;
        int input;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an even number or 999 to quit program: ");
            input = scanner.nextInt();

            if(input % 2 == 0){
                System.out.println("Good Job!");
            }else if(input % 2 != 0 && input != 999){
                System.out.println("You have entered an odd number");
            }else{
                System.out.println("Quit Program");
            }
        }while(input != SENTINEL);
    }
}
