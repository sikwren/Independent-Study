//Problem #6
import java.util.Scanner; 

public class rounding{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int cases = in.nextInt();
        
        for (int i = 0; i < cases; i++){
            double a = in.nextInt();
            double b = in.nextInt();
        
            System.out.print(Math.round(a/b) + " ");
        }
        
    }
}
