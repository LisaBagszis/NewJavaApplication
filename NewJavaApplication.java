public class NewJavaApplication {
    public static void main (String [] args) {
        int kontoStand = 4 + 5;
        int kontoStandSarah = 9;
        int result = kontoStand + kontoStandSarah * 3;

        double testObjekt = 3.5;
        double testObjektZwei = 4.6;
        double zusammenGefasst = testObjektZwei + testObjekt;

        float blaBliBlub = 5.645F;
        float blaBla = 8.9F;
        float powerEins = blaBla + blaBliBlub;

        int myValue = 3;
        if (myValue >= 3) {
            System.out.println("Wert ist größer/gleich 3");
        } else {
            System.out.println("Wert ist kleiner als 3");
        }

        System.out.println(powerEins != zusammenGefasst);

        System.out.println(testObjektZwei + testObjekt);

        System.out.println(kontoStand <= kontoStandSarah)

        ;
    }
}