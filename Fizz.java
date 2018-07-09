public class Fizz {
    public static void main(String[] args){
    int[] a = new int[1024];
    for(int i=1;i<51;i++){
        if(i%3==0){
            System.out.println("FIzzzz");
        }
        else{
            System.out.println(i);
        }
    }
}
}
