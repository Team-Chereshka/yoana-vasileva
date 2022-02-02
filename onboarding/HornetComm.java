import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HornetComm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String privateMessageRegex = "(?<firstQuery>\\d+) <-> (?<secondQuery>[0-9A-Z-a-z]+)$";
        String broadcastRegex = "^(?<firstQuery>[^0-9]+) <-> (?<secondQuery>[0-9A-Z-a-z]+)";

        List<String> privateMessages = new ArrayList<>();
        List<String> broadcasts = new ArrayList<>();

        String text = sc.nextLine();

        Pattern patternMessage = Pattern.compile(privateMessageRegex);
        Pattern patternBroadcast = Pattern.compile(broadcastRegex);
        Matcher matchMessage = null;
        Matcher matchBroadcast = null;


        while (!text.equals("Hornet is Green")) {
            matchMessage = patternMessage.matcher(text);
            if (matchMessage.find()) {

                String neshto = new StringBuilder(matchMessage.group("firstQuery")).reverse().toString();
                String neshto2 = matchMessage.group("secondQuery");
                String neshto3 = neshto + " -> " + neshto2;
                privateMessages.add(neshto3);

            } else {
                matchBroadcast = patternBroadcast.matcher(text);
                if (matchBroadcast.find()) {
                    String frequency = matchBroadcast.group("secondQuery");

                    for (int i = 0; i < frequency.length(); i++) {
                        char currentChar = frequency.charAt(i);
                        if (Character.isLowerCase(currentChar)) {
                            sb.append(Character.toUpperCase(currentChar));
                        } else {
                            sb.append(Character.toLowerCase(currentChar)).toString();
                        }


                    }
                    frequency = sb.toString();
                    sb.setLength(0);
                    String neshto1 = matchBroadcast.group("firstQuery");
                    String neshto2 = frequency;
                    String neshto3 = neshto2 + " -> " + neshto1;
                    broadcasts.add(neshto3);
                }
            }
            text = sc.nextLine();
        }
        System.out.println("Broadcasts: ");
        if (broadcasts.size() > 0) {
            for (String broadcast : broadcasts) {
                System.out.println(broadcast);

            }
        } else {
            System.out.println("None");
        }

        System.out.println("Messages: ");
        if (privateMessages.size() > 0) {


            for (String message : privateMessages) {
                System.out.println(message);
            }
        } else {
            System.out.println("None");
        }
    }
}




