/**
 * Created by tony on 21/08/2016.
 */
public class Factorial {

    public static void main(String[] args) {

        int factorial = 1;

        for(int i = 2; i <= 10; ++i){

            System.out.print("Factorial for " + i + " are ");

            for(int j = i - 1; j > 0; --j){

                if(j != 1){
                    System.out.print(j + " * ");
                }

                factorial *= j;
            }
            System.out.println("1 = " + factorial);
            factorial = 1;
        }

    }
}
