import java.util.*;
class check{ 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int a = sc.nextInt();

    if(a>0){
        System.out.println("number is positive");
    }
    else if(a<0){
        System.out.println("number is negative");
    }
    else{
        System.out.println("number is zero");
    }
}
}