import java.util.Locale;

public class atividade1Udemy {
    public static void main(String[] args) {
        String text1  = "computer";
        String text2 = "office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("products:%n%s, which price is $ %.2f%n%s, which price is $%.2f %n%n", text1, price1, text2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places : %.8f%nRounded (three decimal places): %.3f%n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f",measure);



    }
}
