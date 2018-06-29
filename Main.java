import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        while (true) {
            int n, e;
            System.out.println("Enter the number of array elements:");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int[] a = new int[n];
            int max = a[0];
            System.out.print("Enter the elements");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++)
                if (a[i] > max) {
                    max = a[i];
                }

            System.out.println("Max element is:" + max);
        }
    }

}