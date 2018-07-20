import java.util.Scanner;
public class find {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s;
            System.out.print("Enter the text:");
            s = sc.next();
            String n;
            System.out.print("Enter the text to be searched:");
            n = sc.next();
            for (int i = 0; i < n.length(); i++) {
                for (int j = 0; j < s.length(); j++) {
                    if (n.charAt(i) == s.charAt(j)) {
                        System.out.println(n.charAt(i) + " found at position " + (j + 1));

                    }
                }
            }
        }
    }
}


