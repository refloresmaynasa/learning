package module3;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class CapitalsI18n {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "IN");

        ResourceBundle resources = ResourceBundle.getBundle("resources/Capitals", locale);
        Enumeration<String> bundleKeys = resources.getKeys();
        
        while (bundleKeys.hasMoreElements()) {
            String country = bundleKeys.nextElement();
            String capital = resources.getString(country);
            System.out.println(String.format("The capital of %s is %s", country, capital));
        }
    }
}