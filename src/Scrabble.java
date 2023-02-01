import java.util.HashMap;
import java.util.Map;

/**
 * @author ETOUMI Aristide
 * @apiNote DI-Bootcamp Week6 Day1 ExerciceXP | Exercice4: Compute The Scrabble
 */
public class Scrabble {
    private final Map<String, Integer> letterValue = new HashMap<>();

    public Scrabble() {
        letterValue.put("A", 1);
        letterValue.put("B", 3);
        letterValue.put("C", 3);
        letterValue.put("D", 2);
        letterValue.put("E", 1);
        letterValue.put("F", 4);
        letterValue.put("G", 2);
        letterValue.put("H", 4);
        letterValue.put("I", 1);
        letterValue.put("J", 8);
        letterValue.put("K", 5);
        letterValue.put("L", 1);
        letterValue.put("M", 3);
        letterValue.put("N", 1);
        letterValue.put("O", 1);
        letterValue.put("P", 3);
        letterValue.put("Q", 10);
        letterValue.put("R", 1);
        letterValue.put("S", 1);
        letterValue.put("T", 1);
        letterValue.put("U", 1);
        letterValue.put("V", 4);
        letterValue.put("W", 4);
        letterValue.put("X", 8);
        letterValue.put("Y", 4);
        letterValue.put("Z", 10);
    }

    public void getScore(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            String key = (word.charAt(i) + "").toUpperCase();
            if (letterValue.containsKey(key)) {
                score += letterValue.get(key);
            }
        }

        System.out.println("Le score est " + score);
    }
}
