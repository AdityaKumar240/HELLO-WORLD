/**
 * OOPS Banner App - UC5
 * Render OOPS as Banner using Inline Array Initialization
 */
public class UC5 {

    public static void main(String[] args) {

        // Declare and initialize banner lines in one statement
        String[] bannerLines = {

            String.join("  ",
                    " *** ",
                    " *** ",
                    "**** ",
                    " ****"),

            String.join("  ",
                    "*   *",
                    "*   *",
                    "*   *",
                    "*    "),

            String.join("  ",
                    "*   *",
                    "*   *",
                    "**** ",
                    " *** "),

            String.join("  ",
                    "*   *",
                    "*   *",
                    "*    ",
                    "    *"),

            String.join("  ",
                    " *** ",
                    " *** ",
                    "*    ",
                    "**** ")
        };

        // Print banner using enhanced for loop
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}