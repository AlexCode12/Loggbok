import java.util.ArrayList;
import java.util.Scanner;

public class Loggbok {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        printMenu();
        selectOptions(sn);

    }
    private static void selectOptions(Scanner sn) {
        ArrayList<String> userInput = new ArrayList<String>();
        int input = sn.nextInt();
        sn.nextLine();
        if (input == 1) {
            System.out.println("Här kommer loggboken att finnas.");
        } else if (input == 2) {
            newFile(sn, userInput);
        } else if (input == 3) {
            System.out.println("Under construction.");
        } else if (input == 4) {
            System.out.println("Under construction.");
        } else if (input == 5) {
            System.out.println("Under construction");
        } else if (input == 6) {
            System.out.println("Tack, hejdå.");
            System.exit(0);
        } else {
            System.out.println("Detta är inget korrekt tecken.");
        }
    }

    private static void newFile(Scanner sn, ArrayList<String> userInput) {
        System.out.println("Skriv in ditt inlägg.");
        System.out.println("Avsluta genom att trycka på enter (retur).");
        userInput.add(sn.nextLine());
        System.out.println("Vill du spara filen?");
        System.out.println("1. Ja. 2. Nej.");
        int saveInput = sn.nextInt();
        if (saveInput == 1) {
            System.out.println("Test");
        } else {
            System.out.println("Test");
        }
    }

    private static void printMenu() {
        System.out.println("Välkommen till loggboken. Välj ett av alternativen nedan genom att skriva in dess siffra.");
        System.out.println("1. Visa loggboken." + "\n"
                + "2. Lägg till ett inlägg." + "\n"
                + "3. Uppdatera." + "\n"
                + "4. Spara." + "\n"
                + "5. Läs in." + "\n"
                + "6. Avsluta.");
    }
}


/*
Programmet börjar med att menyn visas. I denna finns sex alternativ. Tänk dig som en telefonsvarare. "För att spara en fil, tryck 4" t.ex, lite åt det hållet tänker jag med menyn.
Man börjar med att skriva in ett nummer från 1-6, precis som menyn säger. Sedan blir det naturligtvis olika beroende på vilket nummer som väljs.
 */