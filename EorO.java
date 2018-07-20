import java.util.Scanner;
public class EorO {
    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elements:");
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();
        }
        en(a,n);
        on(a,n);
        }
    }
public static void en(int[] a,int n) {
        int E=0;
    System.out.println("Even numbers:");
    for (int i = 0; i < n; i++){
        if (a[i] % 2 == 0) {
            System.out.print(a[i]+" ");
        }
    }
}
    public static void on(int[] a,int n) {
        int E=0;
        System.out.println();
        System.out.println("Odd numbers:");
        for (int i = 0; i < n; i++){
            if (a[i] % 2 != 0) {
                System.out.print(a[i]+" ");
            }
        }
    }
}