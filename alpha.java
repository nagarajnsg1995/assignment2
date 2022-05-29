import java.util.Scanner;
public class Alpha {
    public static void main(String[] args) {
        char character;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Character");
        character = scanner.next().charAt(0);
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is vowel");
                break;
            default:
                System.out.println(character + " is consonant");
        }
    }
}