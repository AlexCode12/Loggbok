import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Loggbok {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (true) {
            printMenu();
            selectOptions(sn);
        }
    }

    static ArrayList<LogEntry> userInputs = new ArrayList<LogEntry>();

    private static void selectOptions(Scanner sn) { // Denna metod är till för alternativen på menyn, se printMenu.
        int input = sn.nextInt();
        sn.nextLine();
        if (input == 1) {
            System.out.println(userInputs);
        } else if (input == 2) {
            newFile(sn, userInputs);
        } else if (input == 3) {
            updatePost(sn);
        } else if (input == 4) {
            infoToFile();
        } else if (input == 5) {
            DataInputStream txtIn;
            String filenameTxt = "LoggEntrys.txt";
            try {
                txtIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filenameTxt)));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (input == 6) {
            System.out.println("Tack, hejdå.");
            System.exit(0);
        } else {
            System.out.println("Detta är inget korrekt tecken.");
        }
    }

    private static void infoToFile() {
        String filenameTxt = "LoggEntrys.txt";
        DataOutputStream txtOut;
        {
            try {
                txtOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filenameTxt)));
                try {
                    txtOut.writeBytes(String.valueOf(userInputs));
                    txtOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Inlägget har sparats. \n ");
    }

    private static void updatePost(Scanner sn) {
        System.out.println("Välj vilket inlägg du vill uppdatera. ");
        System.out.println(userInputs);
        System.out.println("Välj ett inlägg genom att skriva in deras index, med start från 0.");
        index(userInputs);
        int elementAt = sn.nextInt();
        sn.nextLine();
        System.out.println("Skriv in det nya som ska sparas i filen.");
        String newMessage = sn.nextLine();
        userInputs.get(elementAt).update(newMessage);
    }

    private static void index(ArrayList<LogEntry> userInputs) {
    }

    private static void newFile(Scanner sn, ArrayList<LogEntry> userInput) { // Frågar användaren efter dess text, och lägger in det i Arraylisten.
        System.out.println("Skriv in ditt inlägg.");
        System.out.println("Avsluta genom att trycka på enter (retur).");
        String newFile = sn.nextLine();
        userInput.add(new LogEntry(newFile));

    }

    private static void printMenu() { // Menyn.
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
Loggboken är mestadels indelad i metoder och klasser.
 */