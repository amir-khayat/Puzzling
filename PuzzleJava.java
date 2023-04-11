import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> randomRolls = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            randomRolls.add(random.nextInt(20) + 1);
        }
        return randomRolls;
    }

    public char getRandomLetter() {
        Random random = new Random();
        char randomLetter = (char) (random.nextInt(26) + 'a');
        return randomLetter;
    }

    public String generatePassword() {
        String password = "";
        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            password += (char) (random.nextInt(26) + 'a');
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordList = new ArrayList<String>();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            String password = generatePassword();
            passwordList.add(password);
        }

        return passwordList;
    }

}