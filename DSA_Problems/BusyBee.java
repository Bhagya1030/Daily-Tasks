/*
 * BUSY BEEBusy Bee is busy with her life and wants you to solve

one problem for her.

The problem is as follows:

You are given an array ‘A’ of size ‘N’ consisting of

integers.

You have to find the number of points (A[i], A[j]) and

‘i’ < ‘j’. Such that their average is greater than or

equal to ‘K’. Input:

4

5 1 3 4

3

Output: 

(5, 1) (5, 3) (5, 4) (3, 4)
 */

package DSA_Problems;
import java.util.*;
import java.util.Scanner;
public class BusyBee {
    
    public static void findPairs(int[] A, int N, int K) {
        List<String> result = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if ((A[i] + A[j]) / 2.0 >= K) {
                    result.add("(" + A[i] + ", " + A[j] + ")");
                }
            }
        }
        
        if (result.isEmpty()) {
            System.out.println("No valid pairs found.");
        } else {
            System.out.println(String.join(" ", result));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int N = s.nextInt();
        int[] A = new int[N];
        
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        
        System.out.print("Enter the value of K: ");
        int K = s.nextInt();
        
        findPairs(A, N, K);
        
    }
}

