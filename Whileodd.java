import java.util.*;
class whileodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=1 && n<=100){
            while(n%2 != 0){
                System.out.println(n);
            }
        }
    }
    
}