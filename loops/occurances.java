package loops;

public class occurances {
    public static void main(String args[]){
        // Scanner input=new Scanner(System.in);
        int num=78745677;
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==7){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
}
