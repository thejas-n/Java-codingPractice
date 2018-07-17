import java.util.Scanner;
public class split {
    public static void main(String[] args) {
        while (true) {
        int n;
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a = 2000;
        int b = 500;
        int c = 200;
        int d = 100;
            while (n != 0) {
                if (n >= a) {
                    int ac = n / a;
                    int m = a * ac;
                    n = n - m;
                    System.out.println(a + "x" + ac + "=" + m);
                }
                if (n >= b) {
                    int bc = n / b;
                    int h = b * bc;
                    n = n - h;
                    System.out.println(b + "x" + bc + "=" + h);
                }
                if (n >= c) {
                    int cc = n / c;
                    int t = c * cc;
                    n = n - t;
                    System.out.println(c + "x" + cc + "=" + t);
                }
                if (n >= d) {
                    int dc = n / d;
                    int q = d * dc;
                    n = n - q;
                    System.out.println(d + "x" + dc + "=" + q);
                }
                if(n<d){
                    System.out.println("Lower denominations not available");
                    break;
                }

            }
        }
    }
}