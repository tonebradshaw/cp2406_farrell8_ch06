import java.util.Scanner;

/**
 * Created by tony on 21/08/2016.
 */
public class Inbetween {

    public static void main(String[] args) {

        int highNumber;
        int lowNumber;
        int firstNumber;
        int secondNumber;

        do {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an Integer: ");
            firstNumber = scanner.nextInt();
            System.out.print("Enter an Integer: ");
            secondNumber = scanner.nextInt();

            if(firstNumber == secondNumber){
                System.out.println("The numbers are the same");
            }

        }while(firstNumber == secondNumber);


        if(firstNumber > secondNumber){

            highNumber = firstNumber;
            lowNumber = secondNumber;

        }else{

            highNumber = secondNumber;
            lowNumber = firstNumber;
        }
        for(int i = lowNumber + 1; i < highNumber; ++i){

            if(i != highNumber - 1){

                System.out.print(i + ", ");

            }else{

                System.out.println(i);
            }
        }
    }
}
