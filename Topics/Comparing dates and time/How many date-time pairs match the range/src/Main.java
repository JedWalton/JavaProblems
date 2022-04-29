import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime[] dates = scanner.tokens()
                .limit(2)
                .map(LocalDateTime::parse)
                .sorted()
                .toArray(LocalDateTime[]::new);

        System.out.println(scanner.tokens()
                .skip(1)
                .map(LocalDateTime::parse)
                .filter(date -> !date.isBefore(dates[0]) && date.isBefore(dates[1]))
                .count());
    }
}