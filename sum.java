import java.util.Scanner;

public class sum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        System.out.println("Enter the second number:");
        int y = scanner.nextInt();
        int sum = x+y;
        System.out.println("The sum of two number is:" + sum);

    }
    
}