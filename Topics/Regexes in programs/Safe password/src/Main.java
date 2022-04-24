import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[a-zA-Z0-9_]{12,}$";

        if (input.matches(regex)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}