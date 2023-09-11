import java.util.Scanner;

public class printtable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = sc.nextInt();

        int[][] table = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                table[i][j] = i * j;
            }
        }
        System.out.println("table : " + table[i][j])
    }
    
}