import java.util.*;
public class alphabetcheck {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        char ch=input.next().trim().charAt(0);  
        if(ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        }  
        else{
            System.out.println("Uppercase");
        }
        input.close();
    }
}
