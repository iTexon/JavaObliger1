import java.util.Scanner;

public class Sirkel {

     public static void main(String[] args) {
         double radius;
         double circumfrence, area, diameter;

         Scanner input = new Scanner(System.in);

         System.out.print("Skriv inn sirkelens radius: ");
         radius = input.nextDouble();

         // Statisk metode som beregner og returnerer sirkelens areal.
         area = Math.PI * Math.pow(radius, 2);
         // Statisk metode som beregner og returnerer sirkelens omkrets.
         circumfrence = 2 * Math.PI * radius;
         // Statisk metode som beregner og returnerer sirkelens diameter.
         diameter = 2 * radius;

         System.out.printf("\n" + "Arealet av sirkelen med radius " + radius + "er " + "%.2f", area);
         System.out.printf("\n" + "Omkretsen av sirkelen med radius " + radius + "er: " + "%.2f", circumfrence);
         System.out.printf("\n" + "Diameteren av sirkelen med radius " + radius + "er: " + "%.2f", diameter);
     }
}
