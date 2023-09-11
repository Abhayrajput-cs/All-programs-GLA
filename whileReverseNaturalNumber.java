import java.util.*;
public class whileReverseNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Numbers are:");
         int i = n;
        
        while(i<=n){
            if(i>=0){
            System.out.println(i);
            i--;
            }
        }
    }
}