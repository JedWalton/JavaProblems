import java.util.*;

class Date {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String date = scn.nextLine();

        String dayRegex = "([0-2][1-9]|3[0-1])";
        String monthRegex = "[0-1][0-2]";
        String yearRegex = "(19[0-9][0-9])|(20[0-9][0-9])";
        String dateRegex = "([0-2][1-9]|3[0-1])[/\\-.][0-1][0-2][/\\-.]((19[0-9][0-9])|(20[0-9][0-9]))";
        String dateRegex2 = "((19[0-9][0-9])|(20[0-9][0-9]))[/\\-.][0-1][0-2][/\\-.]([0-2][1-9]|3[0-1])";

        if (date.matches(dateRegex) || date.matches(dateRegex2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}