import javax.swing.table.AbstractTableModel;
import java.util.*;

public class ListReverse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        List<Integer> input_num = new ArrayList<>();
        List<Integer> result = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {
            int number = Integer.parseInt(input[i]);
            input_num.add(number);
        }
        for (int i = 0; i < input_num.size(); i++) {
            if (input_num.get(i) >= 0) {
                result.add(input_num.get(i));
            }
        }
        Collections.reverse(result);

        if (result.size() == 0) {
            System.out.println("Empty");
        }

        for (Integer integer : result) {
            System.out.print(integer + " ");
        }

    }
}