import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.parse(scanner.next());
        int n = scanner.nextInt();

        LocalDate localDatePlusNDays = localDate.plusDays(n);

        if(localDatePlusNDays.getDayOfYear()==1){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}