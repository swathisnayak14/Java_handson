import java.util.*;
public class switchstat {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        // String fruit=input.next();
        // switch(fruit){
        //     case "mango":
        //         System.out.println("King of fruit");
        //         break;
        //     case "apple":
        //         System.out.println("red fruit");
        //         break;
        //     case "orange":
        //         System.out.println("round fruit");
        //         break;
        //      default:
        //         System.out.println("please enter a valid fruit");
        // }

        // int day=input.nextInt();
        // switch(day){
        //     case 1:
        //     case 2:
        //     case 3:
        //     case 4:
        //     case 5:
        //         System.out.println("weekday");
        //         break;
        //     case 6:
        //     case 7:
        //         System.out.println("weekend");
        //         break;

        // }
        // input.close();

        //multiple switch
        //nested switch
        int empID=input.nextInt();
        String department=input.next();
        switch(empID){
            case 1:
                System.out.println("Swathi");
                break;
            case 2:
            System.out.println("Mayur");
            break;
            case 3:
            System.out.println("Empolyee number 3");
            switch(department){
                case "IT":
                    System.out.println("It dept");
                    break;
                case "Management":
                System.out.println("Management dept");
                break;
                default:
                System.out.println("no dept found");
            }
            break;
                default:
                System.out.println("Enter valid emp no");
        }
    }
}
