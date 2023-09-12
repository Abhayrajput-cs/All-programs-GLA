import java.util.*;
class Program3
{
     void fact(int x)
    {
        int fac=1;
        for(int i=1;i<=x;i++)
        {
            fac=fac*i;
        }
        System.out.println("The factoril of "+x+" is "+fac);
        Program3 obj2=new Program3();
        obj2.great(9,90,100);
    }
    static void great(int a,int b,int c)
    {
         if(a>b && a>c)
         System.out.println(a +" is graeter");
         else if (b>c && b>a)
         System.out.println(b +" is greater");
         else
         System.out.println(c +" is greater");
        Program3 obj1=new Program3();
        System.out.println("this is the static method");
        obj1.fact(3);
    }
    public static void main(String args[])
    {
    Scanner in =new Scanner(System.in);
    int a,b,c,x;
    System.out.println("Enter the number for factorial");
    x=in.nextInt();
    System.out.println("Enter the numbers a,b,c");
    a=in.nextInt();
    b=in.nextInt();
    c=in.nextInt();
    Program3 obj=new Program3();
    obj.fact(x);
    obj.great(a,b,c);   
}
}
