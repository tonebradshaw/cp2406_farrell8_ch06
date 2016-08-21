import com.sun.deploy.util.StringUtils;

/**
 * Created by tony on 21/08/2016.
 */
public class DiagonalOs {

    public static void main(String[] args) {

        String string = "0";

        for(int i = 0; i <= 10; ++i){

            System.out.println(string);
            string = " " + string;
        }
    }
}
