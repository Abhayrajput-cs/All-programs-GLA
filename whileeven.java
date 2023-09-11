import java.util.*;
public class whileeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n%2==0){
            if(n>=1 && n<=100){
                System.out.println(n);
        }
        n++;
    }
}
}
