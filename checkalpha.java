import java.util.*;
class checkalpha{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter anything:");
    char ch = scanner.next().charAt(0);

    if(character.isAlphabetic(ch)){
        System.out.println("The character" +ch +"is an alphabet");
    }
    else if(Character.isDigit(ch)){
        System.out.println("The character" +ch +"is a digit");
    }
    else{
        System.out.println("The character" +ch +"is a special character.");
    }
}
}