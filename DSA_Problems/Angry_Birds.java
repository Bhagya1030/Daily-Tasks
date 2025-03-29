/*
 * 
 * ANGRY BIRDS
There is a long wire along a straight line, which contains N bird nests at positions x1, x2, x3, ...xN.
 
There are B (B <= N) birds, which becomes angry towards each other once put into a nest.
 To put the birds from hurting each other you want to assign birds to nests such that minimum distance between
  any two birds as large as possible. 
 Find the largest minimum distance?I
input:
5
1 2 4 8 9
3
Output: 
3
 */



package DSA_Problems;
import java.util.*;
import java.util.Scanner;
public class Angry_Birds {

    public static boolean canPlaceBirds(int[] nests, int birds, int minDist) {
        int count = 1;
        int lastPlaced = nests[0];
        
        for (int i = 1; i < nests.length; i++) {
            if (nests[i] - lastPlaced >= minDist) {
                count++;
                lastPlaced = nests[i];
                if (count == birds) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int largestMinimumDistance(int[] nests, int birds) {
        Arrays.sort(nests);
        int left = 1, right = nests[nests.length - 1] - nests[0], ans = 0;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canPlaceBirds(nests, birds, mid)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of nests: ");
        int n = scanner.nextInt();
        int[] nests = new int[n];
        
        System.out.println("Enter nest positions: ");
        for (int i = 0; i < n; i++) {
            nests[i] = scanner.nextInt();
        }
        
        System.out.print("Enter number of birds: ");
        int b = scanner.nextInt();
        
        System.out.println("Largest Minimum Distance: " + largestMinimumDistance(nests, b));
        
    }
}

