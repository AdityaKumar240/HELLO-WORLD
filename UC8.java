import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Method to build the character pattern map
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return patternMap;
    }

    // Method to render banner message
    public static void renderBanner(String message, Map<Character, String[]> patternMap) {

        int height = 5; // number of rows in each character

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Map<Character, String[]> characterPatterns = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, characterPatterns);
    }
}