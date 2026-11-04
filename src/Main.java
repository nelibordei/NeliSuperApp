import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alegere = 0;

        while (alegere != 4) {
            System.out.println("\n===== NELI SUPER APP =====");
            System.out.println("1. Ghiceste Numarul");
            System.out.println("2. Calculator Super");
            System.out.println("3. Zar Norocos");
            System.out.println("4. Iesire");
            System.out.print("Alege un joc (1-4): ");
            alegere = scanner.nextInt();

            if (alegere == 1) {
                ghicesteNumarul(scanner);
            } else if (alegere == 2) {
                calculator(scanner);
            } else if (alegere == 3) {
                zarNorocos();
            } else if (alegere == 4) {
                System.out.println("Pa pa, Neli! Te iubesc!");
            } else {
                System.out.println("Alege 1, 2, 3 sau 4!");
            }
        }
    }

    public static void ghicesteNumarul(Scanner scanner) {
        Random random = new Random();
        int numarSecret = random.nextInt(10) + 1;
        int incercare = 0;
        System.out.println("\n--- Ghiceste Numarul 1-10 ---");
        while (incercare != numarSecret) {
            System.out.print("Scrie numarul tau: ");
            incercare = scanner.nextInt();
            if (incercare < numarSecret) {
                System.out.println("E mai MARE!");
            } else if (incercare > numarSecret) {
                System.out.println("E mai MIC!");
            } else {
                System.out.println("AI GHICIT! Esti cea mai tare!");
            }
        }
    }

    public static void calculator(Scanner scanner) {
        System.out.println("\n--- Calculator Super ---");
        System.out.print("Primul numar: ");
        double a = scanner.nextDouble();
        System.out.print("Al doilea numar: ");
        double b = scanner.nextDouble();
        System.out.println("Suma: " + (a + b));
        System.out.println("Diferenta: " + (a - b));
        System.out.println("Inmultire: " + (a * b));
        if (b != 0) {
            System.out.println("Impartire: " + (a / b));
        } else {
            System.out.println("Nu poti imparti la 0!");
        }
    }

    public static void zarNorocos() {
        Random random = new Random();
        int zar = random.nextInt(6) + 1;
        System.out.println("\n--- Zar Norocos ---");
        System.out.println("Ai dat cu zarul si a picat: " + zar);
        if (zar == 6) {
            System.out.println("SUPER NOROC! Ai dat 6!");
        } else {
            System.out.println("Incearca din nou, poate dai 6!");
        }
    }
}

