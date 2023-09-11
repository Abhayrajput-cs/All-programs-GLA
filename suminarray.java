import java.util.*;
class suminarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, sum=0;
        System.out.println("Enter the size of an array:");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i=0; i<a.length; i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        System.out.println(sum);
    }

}