import java.util.Scanner;
public class Readnumtoword {
    static void ToDigits(int n, String[] arr)
        {

            if (n == 0) {
                return;
            }

            int digit = n % 10;
            n = n / 10;

            ToDigits(n, arr);

            System.out.print(arr[digit]);
            System.out.print(" ");
        }

        public static void main(String args[])
        {
            String[] arr = { "zero", "one", "two",   "three", "four",    "five", "six", "seven", "eight", "nine" };
            int n;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter number : ");
            n = scanner.nextInt();


            ToDigits(n, arr);
        }
    }
