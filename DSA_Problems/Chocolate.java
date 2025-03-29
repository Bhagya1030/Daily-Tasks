/*
Chocolate Distribution Problem
Given an integer array arr of size n, where each element represents the number of chocolates a person receives,
 determine the minimum difference between the chocolates distributed to the person receiving the most chocolates and 
 the one receiving the least. Your task is to return the smallest possible difference after distributing
  the chocolates such that the difference between the chocolates of any two people is minimized 
Example:
Input:
n: 5
arr: 10, 4, 12, 3, 1
m=3
Output: 3
*/
package DSA_Problems;
import java.util.Arrays;
import java.util.Scanner;
public class Chocolate{
    public static int FindDifference(int[] arr,int n,int m){
        if(m==0 || n==0){
            return 0;
        }
        Arrays.sort(arr);
        if(n<m){
            return -1;
        }
        int minDiff=Integer.MAX_VALUE;
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an Array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter The number of People:");
        int m=sc.nextInt();
        System.out.println(FindDifference(arr,n,m));

    }
}