import java.util.Scanner;
    public class DOA {
        public static void printA(int n,int[] a){
            for(int k=0;k<n;k++) {
                System.out.print(" "+a[k]);
            }
            System.out.println();
        }
        public static void main(String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of elements:");
            int n= sc.nextInt();
            n=n+2;
            int[] a= new int[n];
            int[] b= new int[n];
            System.out.print("Enter the array elements:");
            for(int k=1;k<=n-2;k++) {
                a[k] = sc.nextInt();
            }
            a[0]=1;
            a[a.length-1]=1;
            System.arraycopy( a, 0, b, 0, a.length );
            printA(n,a);
            for (int i=1;i<=n-2;i++){
                if(b[i-1]==b[i+1]){
                    a[i]=1;
                    printA(n,a);
                }
                else if(b[i-1]!=b[i+1]){
                    a[i]=0;
                    printA(n,a);
                }
            }
        }
    }


