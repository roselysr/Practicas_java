package tp.pr0;

/**
 * Created by miguel on 14/04/2017.
 */
public class FuncsMatematicas {
    public static int factorial (int n){

        int fact = 1;

        if (n == 0){
            return 1;
        } else if (n < 0){
            return 0;
        } else {
            for (int i = n; i > 0 ; i--){
                fact*=i;
            }
            return fact;
        }
    }

    public static void main (String [] args){
        System.out.println(tp.pr0.FuncsMatematicas.factorial(-1));
    }
}
