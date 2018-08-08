import java.util.Random;

public class RandomIntegers{
	public static void main(String[] args){
		Random randomNumbers = new Random();
		int face;

		for (int counter = 1; counter <= 20; counter++ ) {
			//pick random integer from 1 to 6
			face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face);

			if (counter % 5 == 0) {
				System.out.println();
				
			}//end if
		}//end for
	}//end main
}//end class