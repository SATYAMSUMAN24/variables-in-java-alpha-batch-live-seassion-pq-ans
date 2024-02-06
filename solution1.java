// average of 3 number

import java.util.*;
public class solution1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input 1st Number : ");
        int A = sc.nextInt();

        System.out.println("Input 2nd Number : ");
        int B = sc.nextInt();

        System.out.println("Input 4th Number : ");
        int C = sc.nextInt();


        int average = (A + B + C) / 3;
        System.out.println("average is : " + average);
    }
}
