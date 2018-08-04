import java.util.Scanner;

class factorial
{
    public static void main(String args[]) {
        int i, n;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        n = in.nextInt();
        factorial example = new factorial();
        int factorial= example.factorial(n);
        System.out.println("factorial "+factorial);
    }
    public int factorial(int n){
        int fact=1,i;
        for(i=1;i<=n;i++) {
            fact=fact*i;
        }
        return fact;
    }
}