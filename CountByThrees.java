/**
 * Created by tony on 21/08/2016.
 */
public class CountByThrees {

    public static void main(String[] args) {

        int START_COUNT = 3;
        int END_COUNT = 300;

        for(int i = START_COUNT ; i <= END_COUNT; i += 3){

            System.out.print(i + " ");

            if(i % 30 == 0){
                System.out.println();
            }
        }

    }
}
