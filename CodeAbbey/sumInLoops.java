import java.util.Scanner;

public class sumInLoop{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int cases = in.nextInt();
        int sum = 0;
        
        for (int i = 0; i < cases; i++){
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}
