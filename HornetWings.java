import java.util.Scanner;

public class HornetWings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wingFlaps = sc.nextInt();
        double distance = sc.nextDouble();
        int endurance = sc.nextInt();

        int flyDistance = (int) ((wingFlaps / 1000) * distance);
        int flyTime = wingFlaps/100;
        int time = (int) ((wingFlaps / endurance) * 5);
        int resultTime = flyTime+time;

        System.out.println(flyDistance);
        System.out.println(resultTime);
    }
}
//2000 крачки -> 2000/1000 -> 2пъти по 5 м. -> 10м общо
//2000/100 => 20 секунди общо
//2000/200 => 10 почивки по 5 сек = 50сек.