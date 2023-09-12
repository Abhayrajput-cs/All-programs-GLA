class A
{
    void msg()
    {
        b obj1=new b();
    System.out.println(obj1.a);   
    }  
}
class b
{
    static int a=10;
    public static void main(String args[])
    {
        A obj= new A();
        obj.msg(); 
}
}
