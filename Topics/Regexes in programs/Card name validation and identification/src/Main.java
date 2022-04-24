import java.util.*;

class BankCard {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String numbers = scn.nextLine();
        String card = numbers.replaceAll("\\s", "");
        String visaRegex = "(4[\\d]{3}\\s[\\d]{4}\\s[\\d]{4}\\s[\\d]{4})|(4[\\d]{3}[\\d]{4}[\\d]{4}[\\d]{4})";
        String masterCardRegex = "(51|53[\\d]{2})|(2221|2720)[\\d]{4}[\\d]{4}[\\d]{4}";
        String americanExpressRegex = "(34|37)[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*" +
                "[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*[\\d]\\s*";

        if (card.matches(visaRegex)) {
            System.out.println("Visa");
        } else if (card.matches(masterCardRegex)) {
            System.out.println("MasterCard");
        } else if (card.matches(americanExpressRegex)) {
            System.out.println("AmericanExpress");
        } else {
            System.out.println("Card number does not exist");
        }
    }
}