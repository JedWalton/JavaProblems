import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long userInput = scanner.nextLong();
        long factorial = 1;
        long res = 1;

        while (factorial <= userInput) {
            factorial *= ++res;
        }

        System.out.println(res);
    }
}