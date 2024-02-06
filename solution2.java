// input the side of square . you have to output the area of square

import java.util.*;
public class solution2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Double side = sc.nextDouble();

        Double area = side * side;

        System.out.println("area of the square is : " + area);
    }
}