public class Main1 {

        public static void main(String[] args) {
            BonusMilesService1 bonusMilesService1 = new BonusMilesService1();
            long mile = bonusMilesService1.calculate1(10_000);
            System.out.printf("Added bonus miles: %s \n", mile);
        }

}
