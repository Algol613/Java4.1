import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Ticet coast: ");
        BonusMilesService bonusMilesService = new BonusMilesService();
        long mile = bonusMilesService.calculate(in.nextLong());
        in.close();
        System.out.printf("Added bonus miles: %s \n", mile);
    }
}