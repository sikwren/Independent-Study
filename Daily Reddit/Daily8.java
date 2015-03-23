/* Write a program that will print the song "99 bottles of beer
 * on the wall"
 */
public class Daily8 {

	public static void main(String[] args) {
		int i = 99; 
		while ( i > 0){
			System.out.println(i + " bottles of beer on the wall! " + i + " bottles of beer!");
			System.out.println("You take one down and pass it around. " + --i +  " bottles of beer on the wall!" );
			
			if (i == 0){
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more. 99 bottles of beer on the wall!");
			}
		}
	}

}
