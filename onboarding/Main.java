import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //The Dark Medenka Lord Naskor
        //The White Medenka Lord Viktor

        Scanner sc = new Scanner(System.in);

        double darkDamage = 0;
        double whiteDamage = 0;

        int consecutiveWhiteAttack = 1;
        int consecutiveDarkAttack = 1;

        double previousDarkDamage = 0;
        double previousWhiteDamage = 0;


        String command = sc.nextLine();

        while(!command.equals("end")) {
            String[] attacks = command.split(" ");
            int medenkas_count = Integer.parseInt(attacks[0]);
            String medenkaType = attacks[1];
            int currentAttackDamage = medenkas_count * 60;

            if (medenkaType.equals("white")) {
                if (currentAttackDamage == previousWhiteDamage) {
                    consecutiveWhiteAttack++;
                } else {
                    consecutiveWhiteAttack = 1;
                }

                if (consecutiveWhiteAttack == 2) {
                    currentAttackDamage = (int) (currentAttackDamage * 2.75);
                    consecutiveWhiteAttack = 1;
                }
                whiteDamage += currentAttackDamage;
                previousWhiteDamage = currentAttackDamage;
            }

            if (medenkaType.equals("dark")) {
                if (currentAttackDamage == previousDarkDamage) {
                    consecutiveDarkAttack++;
                } else {
                    consecutiveDarkAttack = 1;
                }

                if (consecutiveDarkAttack == 5) {
                    currentAttackDamage = (int) (currentAttackDamage * 4.5);
                    consecutiveDarkAttack = 1;
                }
                darkDamage += currentAttackDamage;
                previousDarkDamage = currentAttackDamage;

            }
            command = sc.nextLine();
        }


            if(darkDamage > whiteDamage) {
                System.out.println("Winner - Viktor");
                System.out.println("Damage - " + darkDamage);
            } else {

                System.out.printf("Winner - Naskor");
                System.out.println("Damage - " + whiteDamage);
            }


      }


        }



