import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate X = LocalDate.parse(scanner.next());
        LocalDate M = LocalDate.parse(scanner.next());
        LocalDate N = LocalDate.parse(scanner.next());

        System.out.println(X.isAfter(M) && X.isBefore(N) ||
                X.isAfter(N) && X.isBefore(M));
    }
}