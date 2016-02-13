//Problem #20
import java.util.Scanner;

public class VowelCount{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        in.nextLine();
        
        for (int i = 0; i < cases; i++){
            String str = in.nextLine();
            int vowel = 0;
            
            for (int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'y'){
                    vowel++;
                }
            }
            System.out.print(vowel + " ");    
        }
    }
}
