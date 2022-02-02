import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppendList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> tokens = new ArrayList<>();

        String[] input = sc.nextLine().split("\\|");

        for (int i = 0; i < input.length; i++) {
            String[] items = input[i].split("//s+");
            for (String item : items) {
                if (!item.isBlank()) {
                    tokens.add(item);
                }

            }
        }

        for (String s : tokens) {
            System.out.print(s + " ");

        }

    }
}

