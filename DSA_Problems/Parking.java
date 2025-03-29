/*
 * Parking Lot Problem
You are given a parking lot represented as a character array arr of size n, 
where each element can either be 'S' (indicating an empty slot) or 'X' (indicating an occupied slot).
 Find the maximum number of cars that can be parked consecutively in the parking lot. 
 Cars can only park in empty slots and must park in consecutive empty slots.
Example:
Input:
n: 16
arr: XXXSSSXXSXXSSXXSXX
Output:
3
 */
package DSA_Problems;
import java.util.Scanner;
public class Parking {
    public static int Plot(String arr){
        int maxCount = 0, currentCount = 0;
        
        for (char c : arr.toCharArray()) {
            if (c == 'S') {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        
        return maxCount;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the parking lot string: ");
        String arr = sc.next();
        System.out.println("Maximum cars that can be parked consecutively: " + Plot(arr));


    }
}
