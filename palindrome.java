import java.util.Scanner;

public class pali {
    public static void main(String args[]){
        int n,rev=0,rem;
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int num=n;
        while(n!=0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.print("rev =" + Integer.toString(rev));
        if(rev == num){
            System.out.println("\nit's a palindrome");
        }
        else{
            System.out.println("\nit's not a palindrome");
        }
    }
}