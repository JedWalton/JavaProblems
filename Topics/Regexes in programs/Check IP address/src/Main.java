import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String regex = "(((2[0-5][0-5])|([0-1][0-9][0-9])|([0-9][0-9])|[0-9])[.]){3}((2[0-5][0-5])|" +
                "([0-1][0-9][0-9])|([0-9][0-9])|[0-9])";

        String pattern = scanner.nextLine();

        if (pattern.matches(regex)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}