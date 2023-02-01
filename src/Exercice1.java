import java.util.Scanner;

/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day1 ExerciceXP | Exercice1: Three Angles Of A Triangle
 */
public class Exercice1 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez l'angle 1 du triangle");
        double angle1 = scanner.nextInt();
        System.out.println("Entrez l'angle 2 du triangle");
        double angle2 = scanner.nextInt();
        System.out.println("Entrez l'angle 3 du triangle");
        double angle3 = scanner.nextInt();

        if (angle1 + angle1 + angle3 == 180) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle.");
        }
    }
}
