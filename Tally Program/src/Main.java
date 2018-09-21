import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<Character, Integer> scoreMap = new HashMap<>();

        String line = null;

        while(s.hasNext()) {
            line = s.nextLine();

            char[] chars = line.toCharArray();

            for (char c : chars) {
                boolean lowerCase = Character.isLowerCase(c);

                if(scoreMap.get(Character.toLowerCase(c)) == null) {
                    scoreMap.put(Character.toLowerCase(c), 1);
                } else {
                    if(lowerCase) {
                        scoreMap.put(Character.toLowerCase(c), scoreMap.get(Character.toLowerCase(c)) + 1);
                    } else scoreMap.put(Character.toLowerCase(c), scoreMap.get(Character.toLowerCase(c)) + -1);
                }
            }

            System.out.println(scoreMap.toString());
        }
    }
}