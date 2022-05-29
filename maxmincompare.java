public class maxmincompare {
    public static void main(String[] args) {
        int a=6;
        int b=2;
        int c=10;
        int max;
        int min;
     int  w=(a+b)*c;
        System.out.println(w);
     int  x=(c+a)/b;
        System.out.println(x);
     int y=(a%b)+c;
        System.out.println(y);
     int  z=(a*b)+c;
        System.out.println(z);

        if(w>x && w>y && w>z) {
           max = w;
        }
    else    if(x>w && x>y && x>z) {
            max = x;
        }
    else if (y>x && y>w && y>z) {
           max= y;
        }
    else {
            max = z;
        }
            System.out.println("max value is " +max);


        if(w<x && w<y && w<z) {
            min = w;
        }
        else    if(x<w && x<y && x<z) {
            min = x;
        }
        else if (y<x && y<w && y<z) {
            min = y;
        }
        else {
         min = z;
        }
        System.out.println("min value is " +min);

    }
}
