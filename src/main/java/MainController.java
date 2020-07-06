import java.util.Locale;
import java.util.ResourceBundle;

public class MainController {

    public static void main(String[] args) {
        System.out.println("1-Default, 2-Russian");
        String input = "2";
        String country = "";
        String lang = "";
        if(input.equals("2")) {
            country = "BY";
            lang = "RU";
        }
        Locale locale = new Locale(lang, country);
        ResourceBundle resources = ResourceBundle.getBundle("property.text", locale);
        String comma = ", ";
        String first = resources.getString("first");
        String second = resources.getString("second");
        String third = resources.getString("third");
        System.out.println(new StringBuilder(first)
                                .append(comma)
                                .append(second)
                                .append(comma)
                                .append(third));
    }

}
