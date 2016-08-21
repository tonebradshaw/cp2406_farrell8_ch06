import java.util.Scanner;

/**
 * Created by tony on 21/08/2016.
 */
public class CountByAnything {

    public static void main(String[] args) {

        int START_COUNT = 3;
        int END_COUNT = 300;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an increment value: ");
        int increment = scanner.nextInt();

        for(int i = START_COUNT ; i <= END_COUNT; i += increment){

            System.out.print(i + " ");
            ++count;

            if(count == 10){
                System.out.println();
                count = 0;
            }
        }

    }
}
