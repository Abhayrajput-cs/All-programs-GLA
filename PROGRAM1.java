import java.util.*;
class PROGRAM1
{
    void area_of_circle(int x)
    {
        double area=3.14*x*x;
        System.out.println("The AREA of circle is "+area);
    }
    void area_of_rect(int a,int b)
    {
         int Rectarea=a*b;
         System.out.println("The AREA of RECTANGLE is "+Rectarea);
         
    }
    public static void main(String args[])
    {
    Scanner in =new Scanner(System.in);
    int a,b,x;
    a=in.nextInt();
    b=in.nextInt();
    x=in.nextInt();
    PROGRAM1 obj=new PROGRAM1();
    obj.area_of_circle(a);
    obj.area_of_rect(b,x);
    
    
}
}
