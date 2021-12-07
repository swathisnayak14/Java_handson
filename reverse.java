public class reverse {
    public static void main(String args[]){
        int n=7896;
        int result=0;
        while(n>0){
            int rem=n%10;
            result=result*10+rem;
            n/=10;
        }
        System.out.println(result);
    }
}
