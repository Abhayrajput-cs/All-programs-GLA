import java.util.*;
import java.lang.Math;
class loop10
{
    public static void main(String args[])
    { 
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double m=Math.log10(n);
        int c=(int)m;
        System.out.print(c+1);
    }
}
