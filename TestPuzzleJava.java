import java.util.Random;
import java.util.ArrayList;

public class TestPuzzleJava {
    
	public static void main(String[] args) {

		PuzzleJava generator = new PuzzleJava();
        
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        char randomletter = generator.getRandomLetter();
        System.out.println(randomletter);

        String password = generator.generatePassword();
        System.out.println(password);

        ArrayList<String> passwordList = generator.getNewPasswordSet(3);
        System.out.println(passwordList);
        
		// Write your other test cases here.


	}
}
