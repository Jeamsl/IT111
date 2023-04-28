import javax.naming.ldap.SortControl;

public class litersToGallons {

    public static void main(String[] args) {
        double liter, gallon;

        for (gallon = 1; gallon <= 100; gallon = gallon + 4) {
            liter = gallon * 3.785411784;
            liter = (double) Math.round(liter * 100) / 100;

            if (gallon == 1) {
                System.out.printf("%.2f", liter);
                System.out.println("  Liters = " + gallon + " Gallon");
            } else {
                System.out.printf("%.2f", liter);
                System.out.println(" Liters = " + gallon + " Gallons");
            }
            if (gallon % 10 == 7) {
                System.out.println();
            }

        }
        System.out.println("We are done!!!");

    }

}