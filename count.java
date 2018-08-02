public class count {
    public static char maxrep(String s){
       int count[]=new int[200];
       for (int i=0;i<s.length();i++){
           count[s.charAt(i)]++;
       }
       int maxcount=count[0];
        char maxchar = (char) 0;
        for(int i = 1; i < 200; i++){
            if(count[i] > maxcount){
                maxcount = count[i];
                maxchar = (char) i;
            }
        }
        return maxchar;
    }
    public static void main(String[] args){
        String s="example";
        System.out.print(maxrep(s));
    }
}