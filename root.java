public class root {
    public static void main(String[] args) {
        double a=8,b=4, c=-4;
        double root1,root2;
        double delta = ((b * b) - 4  * (a * c));
        System.out.println(+delta);
       if (delta > 0)
       {
         root1 = (-b + Math.sqrt(delta)) / (2 * a);

         root2 = (-b - Math.sqrt(delta)) / (2 * a);

           System.out.println("root1 and root2 " +root1  +root2);
       }

       else if (delta == 0) {
           root1 = root2 = -b / (2 * a);
           System.out.println("root1 = root2 " +root1);
       }
       else {
           double result = -b / (2 * a);
           System.out.println("root1 " +result );
           System.out.println("root2 " +result );
       }
    }
}
