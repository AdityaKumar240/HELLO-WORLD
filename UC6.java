/**
 * OOPS Banner App - UC6
 * Demonstrates refactoring banner logic into helper methods
 */
public class UC6 {

    // Helper method for O pattern
    public static String getOPattern() {
        return String.join("\n",
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        );
    }

    // Helper method for P pattern
    public static String getPPattern() {
        return String.join("\n",
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        );
    }

    // Helper method for S pattern
    public static String getSPattern() {
        return String.join("\n",
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        );
    }

    public static void main(String[] args) {

        // Array initialization using methods
        String[] bannerLines = {
                getOPattern(),
                getOPattern(),
                getPPattern(),
                getSPattern()
        };

        // Print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}