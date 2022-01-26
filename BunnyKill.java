import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BunnyKill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = 0;
        System.out.println("Enter the layout");
        String matrix = sc.nextLine();
        String[] input = matrix.split(" ");

        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        int[][] layout = new int[rows][cols];

        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                layout[i][j] = sc.nextInt();
            }
        }
        sc.nextLine();

        System.out.println("Enter the bomb bunny coordinates");
        String count = sc.nextLine();
        String[] coordinates = count.split(" ");


        int snowball = 0;
        for (int i = 0; i < coordinates.length; i++) {

            //razdelqme 1,1 -> 1row, 1col
            String[] splitCoordinates = coordinates[i].split(",");
            int bunnyRow = Integer.parseInt(splitCoordinates[0]);
            int bunnyCol = Integer.parseInt(splitCoordinates[1]);
            int bunnyPower = layout[bunnyRow][bunnyCol];
            snowball += bunnyPower;

            for (int j = bunnyRow - 1; j <= bunnyRow + 1; j++) {
                for (int z = bunnyCol - 1; z <= bunnyCol + 1; z++) {
                    if(j >= 0 && j < rows && z >= 0 && z < cols) {
                        layout[j][z] -= bunnyPower;
                    }
                }
            }
        }

        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout.length; col++) {
                if (layout[row][col] <0){
                    layout[row][col] = 0;
                }
                snowball += layout[row][col];
            }
        }

        for (int row = 0; row < layout.length; row++) {
            for (int col = 0; col < layout.length; col++) {
                System.out.print(layout[row][col]+ " ");
            }
            System.out.println();
        }


        System.out.printf("%d", snowball);
        System.out.println();




    }

}













