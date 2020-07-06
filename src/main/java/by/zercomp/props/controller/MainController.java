package by.zercomp.props.controller;

import by.zercomp.props.type.LocaleType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainController {

    public static void main(final String[] args) throws IOException {
        System.out.println("1-Russian, 2-German, 3-French, 4-Swedish, Other-Default");
        int input = readConsole();
        LocaleType chooseType = chooseType(input);
        Locale current = new Locale(chooseType.getLang(), chooseType.getCountry());
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

    private static int readConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

    private static LocaleType chooseType(int input) {
        switch (input) {
            case 1: {
                return LocaleType.BELARUS;
            }
            case 2: {
                return LocaleType.GERMANY;
            }
            case 3: {
                return LocaleType.FRANCE;
            }
            case 4: {
                return LocaleType.SWEDEN;
            }
            default: {
                return LocaleType.DEFAULT;
            }
        }
    }
}
