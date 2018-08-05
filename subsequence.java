public class subsequence {
    public static void sub(int[] a){
        for(int i=0;i<a.length-1;){
            for(int j=1;j<a.length-1;){
                for(int k=2;k<a.length-1;){
                    if(a[i]<a[j]&&a[j]<a[k]){
                        System.out.println("the sequence:"+a[i]+" "+a[j]+" "+a[k]);
                        i++;
                        j++;
                        k++;
                    }
                    else{
                        i++;
                        j++;
                        k++;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int[] a = new int[]{5,2,6,1,8,9,0};
        sub(a);
    }
}
