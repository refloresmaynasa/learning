package i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class I18nDemo {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");

        ResourceBundle bundle = ResourceBundle.getBundle("resources/LocaleTest", locale);
        System.out.println(bundle.getString("how_are_you"));

        locale = new Locale("ms", "MY");

        bundle = ResourceBundle.getBundle("resources/LocaleTest", locale);
        System.out.println(bundle.getString("how_are_you"));
    }
}