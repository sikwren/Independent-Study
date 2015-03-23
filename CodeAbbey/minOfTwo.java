import java.util.Scanner;

public class minOfTwo{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int cases = in.nextInt();
        
        for (int i = 0; i < cases; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.print(Math.min(a,b) + " ");
        }
    }
}
