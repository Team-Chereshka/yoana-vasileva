import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BunnyKill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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


        for (int i = 0; i < coordinates.length; i++) {
            //razdelqme 1,1 -> 1row, 1col
            String[] splitCoordinates = coordinates[i].split(",");
            int bunnyRow = Integer.parseInt(splitCoordinates[0]);
            int bunnyCol = Integer.parseInt(splitCoordinates[1]);

        }


        List<String> badBunnies = new ArrayList<>();
        for (int i = 0; i < coordinates.length; i++) {
            badBunnies.add(coordinates[i]);
        }
        System.out.println(badBunnies);




       for (int i = 0; i < layout.length; i++) {
            for (int j = 0; j < layout.length; j++) {
                System.out.print(layout[i][j] + " ");
            }
            System.out.println();
        }


    }

}













