// Enter cost of 3 Iteams from the user -a pencil,pen and eraser 
//you have to output the total cost of the item back to the user as their bill

import java.util.Scanner;
import java.utill.*;
public class solution3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        float pencil = sc.nextFloat();
        float pen    = sc.nextFloat();
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Bill is : " + total);

        // add gst on it with 18%
        float newTotal = total + (0.18f * total);

        System.out.println("Bill with 18% tax : " + newTotal);


    }
}