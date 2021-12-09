import java.util.*;
public class Functions {
    public static void main(String args[]){
        sum();
    }


    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter two numbers");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int sum=num1+num2;
        System.out.println("sum is: "+sum);
        input.close();
    }
}
