import java.util.Scanner;
public class SecLar {
    public static void main(String[] args) {
        while(true){
        System.out.print("Enter the number of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the array elemnts:");
                for(int k=0;k<n;k++){
                    a[k]=sc.nextInt();
                }
        int max = a[0];
        int seclar = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max)
                max = a[i];
        }
        //System.out.println(max);
        for (int j = 0; j < n; j++) {
            if (a[j] > seclar && a[j] < max) {
                seclar = a[j];
            }
        }

        System.out.println("Second largest element:"+seclar);
    }
}
}

