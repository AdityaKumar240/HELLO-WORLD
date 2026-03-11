
public class UC7 {
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        /**
         * Constructor
         * @param character character symbol
         * @param pattern banner pattern of the character
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Getter for character
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Getter for pattern
         * @return pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to retrieve pattern for a character
     * @param ch input character
     * @param patterns array of CharacterPatternMap objects
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {

        for (CharacterPatternMap cp : patterns) {
            if (cp.getCharacter() == ch) {
                return cp.getPattern();
            }
        }
        return null;
    }

    /**
     * Utility method to display banner message
     * @param message banner text
     * @param patterns character pattern map
     */
    public static void displayBanner(String message, CharacterPatternMap[] patterns) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = getCharacterPattern(ch, patterns);

                if (pattern != null) {
                    line.append(pattern[row]).append(" ");
                }
            }

            System.out.println(line.toString());
        }
    }

    /**
     * Main Method
     */
    public static void main(String[] args) {

        CharacterPatternMap[] patterns = {

            new CharacterPatternMap('O', new String[]{
                    " *** ",
                    "*   *",
                    "*   *",
                    "*   *",
                    " *** "
            }),

            new CharacterPatternMap('P', new String[]{
                    "**** ",
                    "*   *",
                    "**** ",
                    "*    ",
                    "*    "
            }),

            new CharacterPatternMap('S', new String[]{
                    " ****",
                    "*    ",
                    " *** ",
                    "    *",
                    "**** "
            })
        };

        String message = "OOPS";

        displayBanner(message, patterns);
    }
}