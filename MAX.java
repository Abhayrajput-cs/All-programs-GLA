import java.util.*;
class MAX{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number:");
    int a = sc.nextInt();
    System.out.println("Enter second number:");
    int b = sc.nextInt();
    res = a>b?1:0;

    switch(res){
        case 1:
        System.out.println("a is maximim");
        break;
        case 0:
        if(a==b){
            System.out.println("both are equal");
        }
        else{
        System.out.println("b is maximum");
        break;
    }
}
}