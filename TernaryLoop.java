import java.util.*;
class TernaryLoop{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    n = n>0?1:0;
    switch(n){
        case 1:
        System.out.println("number is positive");
        break;
        case 2:
        if(n==0){
            System.out.println("Number is zero");
        }
        else{
            System.out.println("number is negative");
        }
        break;
    }
}
}