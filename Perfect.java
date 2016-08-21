/**
 * Created by tony on 21/08/2016.
 */
public class Perfect {

    public static void main(String[] args) {

        int total;

        System.out.print("Perfect numbers are ");

        for(int i = 1; i < 10000; ++i){

            total = 0;

            for(int j = 1; j < i; ++j){

                if(i % j == 0){

                    total += j;
                }
            }
            if(total == i){
                System.out.print(i + " ");
            }
        }
    }
}
