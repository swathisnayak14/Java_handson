import java.util.*;

public class Arguments {
    public static void main(String args[]){
        //instead of using Scanner to take input,
        // take input while calling the functions.
        int ans=sum(10,90);
        System.out.println("Sum is= "+ans);
    }
    static int sum(int a,int b){
        int sum1=a+b;
        return sum1;
    }
}
