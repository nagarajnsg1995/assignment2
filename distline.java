import java.util.*;
public class distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number x1 ");
        int x1 = sc.nextInt();
        System.out.print("Enter second number x2 ");
        int x2 = sc.nextInt();
        System.out.print("Enter third number y1 ");
        int y1 = sc.nextInt();
        System.out.print("Enter third number y2 ");
        int y2 = sc.nextInt();
      double Line =Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)*1);
      System.out.println(Line);
    }
}