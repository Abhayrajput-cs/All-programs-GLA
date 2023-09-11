 import java.util.Scanner;

public class numberdivisible {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = scanner.nextInt();

        if(x%3 == 0 && x%5 == 0)
        System.out.println("It is divisible by both 3 and 5");
        else
        System.out.println("not divisible");
    }
}