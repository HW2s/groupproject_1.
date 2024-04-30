import java.util.Scanner;
import java.util.Random;

//to get the name and generate password!!!
public class namePass {
    public String name;
    public String lastName;
    public String password;

    public namePass() {
        this.name = getName();
        this.lastName = getLast();
        this.password = generatePassword();
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first Name:");
        String name = scanner.nextLine();
        return name;

    }

    public String getLast() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your last Name: ");
        String lastName = scanner.nextLine();
        return lastName;
    }

    public String generatePassword() {
        String firstThreeLetters = name.substring(0, Math.min(name.length(), 3)).toLowerCase();
        String lastLetter = lastName.substring(lastName.length() - 1).toUpperCase();
        Random rand = new Random();
        int randomNumber = rand.nextInt(90) + 10;
        return lastLetter + firstThreeLetters + randomNumber;

    }

}