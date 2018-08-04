public class BinarySearch{
    public static void search(int[] a,int key){
        int start=0;
        int end=a.length-1;
        int mid=(start + end) / 2;
        while(key==key) {
            if (key == a[mid]) {
                System.out.print("Element found at:" + mid);
                break;
            } else if (key <a[mid]) {
                end = mid - 1;
                mid = (start + end) / 2;
            } else {
                start = mid + 1;
                mid = (start + end) / 2;
            }
            if(start>end){
                System.out.print("Element not found");
            }

        }
        }
        public static void main(String[] args){
        int[] a=new int[]{1,2,3,4,5,6,7};
        int key=7;
        search(a,key);

        }
    }

