import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ninja1 = sc.nextLine();
        String ninja2 = sc.nextLine();

        int staminaNinja1 = 1;
        int staminaNinja2 = 1;
        int powerNinja1 = 1;
        int powerNinja2 = 1;


        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        char[][] field = new char[arr[0]][arr[1]];

        int ninja1Col = 0;
        int ninja1Row = 0;
        int ninja2Col = 0;
        int ninja2Row = 0;

        for (int row = 0; row < field.length; row++) {
            String input = sc.nextLine().toUpperCase();
            for (int col = 0; col < field.length; col++) {
                field[row][col] = input.charAt(col);
            }

        }

        String[] input = sc.nextLine().split("");

        while(staminaNinja1 > -1 || staminaNinja2 > -1) //ninja1.move
                                                        //ninja2.move
    }
    private static void move(char[][] field, int row, int col, char direction) {

        Scanner scanner = new Scanner(System.in);
        char input = scanner.nextLine().charAt(0);
        switch (input) {
            case 'U' -> move(field, row - 1, col, 'U');
            case 'D' -> move(field, row + 1, col, 'D');
            case 'R' -> move(field, row, col + 1, 'R');
            case 'L' -> move(field, row, col + 1, 'L');

        }

        //todo: add all cases but first create vegetables and find a way to deferentiate ninjas

        if(input == 'U' || input == 'D' ||
            input == 'R' || input == 'L'){

        }
    }

    private static boolean isInsideBounds(char[][]field, int row, int col){
        return row < field.length && row >=0  && col < field[row].length && col>=0;
    }




}
