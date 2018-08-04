import java.util.Scanner;

class calculator {

    int sum(int a, int b) {
        int sum;
        sum = a + b;
        System.out.println("sum =" + sum);
        return sum;
    }

    int diff(int a, int b) {
        int diff;
        diff = a - b;
        System.out.println("diff =" + diff);
        return diff;
    }

    int porduct(int a, int b) {
        int product;
        product = a * b;
        System.out.println("product =" + product);
        return product;
    }

    int quo(int a, int b) {
        int quo;
        quo = a / b;
        System.out.println("quo =" + quo);
        return quo;
    }
}

public class calculator{
    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
       System.out.println("Enter the numbers");
        a = in.nextInt();
        b = in.nextInt();
        calculator mycal = new mycal();
        mycal.sum();

    }
}
