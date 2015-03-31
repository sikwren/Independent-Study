import java.util.*;//import scanner

public class suminloops{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int sum = 0;
        int cases = in.nextInt();
        
        for (int i = 0; i < cases; i++){
             int n = in.nextInt();
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
