import java.util.Scanner;

public class Loggbok {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Välkommen till loggboken. Välj ett av alternativen nedan genom att skriva in dess siffra.");
        System.out.println("1. Visa loggboken." + "\n"
                + "2. Lägg till ett inlägg." + "\n"
                + "3. Uppdatera." + "\n"
                + "4. Spara." + "\n"
                + "5. Läs in." + "\n"
                + "6. Avsluta.");
        int input = sn.nextInt();
        if (input == 1) {
            System.out.println("Här kommer loggboken att finnas.");
        } else if (input == 2) {
            System.out.println("Det går inte att skriva inlägg just nu.");
        } else if (input == 3) {

        } else if (input == 4) {

        } else if (input == 5) {

        } else if (input == 6) {
            System.out.println("Tack, hejdå.");
            System.exit(0);
        } else {
            System.out.println("Detta är inget korrekt tecken.");
        }
    }
}


/*
Programmet börjar med att menyn visas. I denna finns sex alternativ. Tänk dig som en telefonsvarare. "För att spara en fil, tryck 4" t.ex, lite åt det hållet tänker jag med menyn.
Man börjar med att skriva in ett nummer från 1-6, precis som menyn säger. Sedan blir det naturligtvis olika beroende på vilket nummer som väljs.
 */