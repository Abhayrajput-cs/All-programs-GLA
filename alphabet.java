import java.util.*;
class alphabet
{
    public static void main()
    {
        Scanner in =new Scanner(System.in);
        char a=in.next().charAt(0);
        if((a>='a' && a<='z' )||(a>='A' && a<='Z'))
        System.out.println("Character");
        else
        System.out.println(" Not a Character");
    }
}