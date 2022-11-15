package MondayOfMission.mission2_v2;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        //System.out.println(((KenyaAmericano) kenyaAmericano).temp);

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}