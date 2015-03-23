import java.util.Scanner;

public class minOfThree{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            
            if (a < b && a < c) {
                System.out.print(a + " ");
            
            } else if (b < a && b < c) {
                System.out.print(b + " ");
                
            } else {
                System.out.print(c + " ");
            }
        }
    }
}
