package Tech_23;
import java.util.Scanner;
public class Catalian {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int number=sc.nextInt();
        if(number<=0){
            System.out.println("0");
        }
        else{
            for(int i=0;i<number;i++){
            System.out.println(FindCatalian(i));
        }
    }
    }
    public static long Findfact(int num){
        long res=1;
        for(int i=1;i<=num;i++){
            res=res*1;
        }
        return res;
    }
    public static long FindCatalian(int n){
          if(n<=1){
            return 1;
          }
          long fact=Findfact(2*n);
          fact=fact/Findfact(n);
          fact=fact/Findfact(n);
          fact=fact/(n+1);
          return fact;
    }
}
