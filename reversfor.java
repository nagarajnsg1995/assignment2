 public class revnum {
    
        public static void main(String[] args)
        {
            int num = 1234, rev = 0;
            for( ;num != 0; num=num/10)
            {
                int rem = num % 10;
                rev = rev * 10 + rem;
            }
            System.out.println("The reverse of the given number is: " + rev);
        }
    }
