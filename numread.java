import java.util.Scanner;
public class Readnumber {
    public static void main(String[] args) {
        int num ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        num = scanner.nextInt();
        if (num == 1)
        {
            System.out.println("num=one -" +num);
        }

       else if (num == 10)
        {
            System.out.println("num=ten - " +num);
        }
        else if (num== 100)
        {
            System.out.println("num=hundred -" +num);
        }
        else if (num == 1000)
        {
            System.out.println("num=thousand -" +num);
        }
        else
            System.out.println("ten thousand -" +num);
    }

}
