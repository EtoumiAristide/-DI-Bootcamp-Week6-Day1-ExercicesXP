import java.util.Scanner;

/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day1 ExerciceXP | Exercice2: Time Difference
 */
public class Exercice2 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Entrez le décallage horaire entre votre domicile et votre destination.
                (Entrez un nombre négatif si l'horaire de destination est inférieur à l'horaire du domicile
                """);

        int decHoraire = scanner.nextInt();
        int midnightHourDest = decHoraire >= 0 ? decHoraire : 24 + decHoraire;
        int noonHourDest = 12 + decHoraire;

        System.out.println("L'heure de la destination sera " + midnightHourDest + "H lorsqu'il sera minuit au domicile " +
                "\n et " + noonHourDest + "H lorsqu'il sera midi au domicile");
    }
}
