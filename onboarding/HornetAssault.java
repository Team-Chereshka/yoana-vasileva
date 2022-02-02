package OnBoarding;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HornetAssault {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstInput = sc.nextLine().split(" "); //broika na kosheri / pcheli
        String[] secondInput = sc.nextLine().split(" "); //broika na stursheli / power
        int hornetCounter = 0;
        int hiveCounter = 0;

        int[] hive = new int[firstInput.length];
        int[] hornets = new int[secondInput.length];

        for (int i = 0; i < hive.length; i++) {
            hive[i] = Integer.parseInt(firstInput[i]);
        }//hives

        for (int i = 0; i < hornets.length; i++) {
            hornets[i] = Integer.parseInt(secondInput[i]);
        }//hornets


        for (int i = 0; i < hive.length; i++) {
            for (int j = 0; j < hornets.length; j++) {
                hive[i] -= hornets[j];
            }
                if (hive[i] >= 0) {
                    hornets[hornetCounter] = 0;
                    hornetCounter++;

                }
            }

        for (int i = 0; i < hive.length; i++) {
            if(hive[i] > 0){
                System.out.print(hive[i] + " ");
                hiveCounter++;
            }

        }
        if(hiveCounter == 0){
            for (int i = 0; i < hornets.length; i++) {
                if(hornets[i] > 0) System.out.print(hornets[i] + " ");
            }
        }
    }
}

