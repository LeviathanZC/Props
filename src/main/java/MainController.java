import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainController {

    private static final String BELARUS = "BY";
    private static final String RUSSIAN = "RU";

    public static void main(final String[] args) throws IOException {
        System.out.println("1-Default, 2-Russian");
        int input = readNumber();
        String country = "";
        String lang = "";
        if(input == 2) {
            country = BELARUS;
            lang = RUSSIAN;
        }
        Locale current = new Locale(lang, country);
        ResourceBundle resources = ResourceBundle.getBundle("property.text", current);
        final String comma = ", ";
        final String first = resources.getString("first");
        final String second = resources.getString("second");
        final String third = resources.getString("third");
        System.out.println(new StringBuilder(first)
                                .append(comma)
                                .append(second)
                                .append(comma)
                                .append(third));
    }

    private static int readNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

}
