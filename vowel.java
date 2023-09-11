import java.util.*;
public class vowel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any caracter:");
        char ch = sc.next().charAt(0);

        if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='O'){
            System.out.println("The character is vowel");
        }
        else{
            System.out.println("The character is not a vowel");
        }
    }

}
