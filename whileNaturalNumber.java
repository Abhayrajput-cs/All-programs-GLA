import java.util.*;
public class whileNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("numbers are:");
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}