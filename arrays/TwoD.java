import java.util.*;
public class TwoD {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int [][]arr=new int [3][3];
        //input
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=input.nextInt();
            }
        }
        //output
        
        //another way
        // for(int row=0;row<arr.length;row++){
        //    System.out.println(Arrays.toString(arr[row]));
        // }

        //another way using enhanced for loop

        for(int[]a:arr){
            System.out.println(Arrays.toString(a));
        }
    input.close();
    }
}
