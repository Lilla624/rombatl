// A program kiszámítja egy rombusz területét annak két átlója segítségével
// Varga Lilla, SZOFT II-1-N, 2024-10-03

import java.util.Scanner;

public class Rombatl {
    public void solution() {
        System.out.println("Rombusz terület");

        Scanner sc = new Scanner(System.in);

        System.out.print("Rombusz átlója (e): ");
        String eStr = sc.nextLine();
        double e = Double.parseDouble(eStr);

        System.out.print("Rombusz átlója (f): ");
        String fStr = sc.nextLine();
        double f = Double.parseDouble(fStr);

        double area = e * f / 2;
        System.out.printf("A rombusz területe: %.2f\n", area);

    }
}
