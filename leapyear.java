import java.util.*;
class leapyear
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        if((n%4==0&&n%100!=0)||n%400==0)
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("Not a leap year");
        }
    }
}