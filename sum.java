public class sum {
    public static void main(String[] args) {

        int[] a = new int[]{4, 1, 6, 8};
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (a[i] + a[j] == 10) {
                    int sum=a[i]+a[j];
                    System.out.println("True the sum is" +sum);
                }
            else{
                    int sum=a[i]+a[j];
                    System.out.println("False the sum is" +sum);
                }

            }
        }
    }
}
