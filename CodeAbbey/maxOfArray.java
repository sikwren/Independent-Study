//Problem #15
import java.util.Scanner;

public class maxOfArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int max = -999999;
        int min = 999999;
        
        for (int i = 0; i < 300; i++){
            int a = in.nextInt();
            
            if (a > max){
                max = a;
            }else if (a < min){
                min = a;    
            }
            
        }
        System.out.print(max + " " + min);
    }
}
  
