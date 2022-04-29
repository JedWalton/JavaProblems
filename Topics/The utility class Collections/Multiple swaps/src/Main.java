import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.asList(scanner.nextLine().split("\\s"));
        int numberOfSwaps = scanner.nextInt();
        for (int i = 0; i < numberOfSwaps; i++) {
            Collections.swap(list, scanner.nextInt(), scanner.nextInt());
        }
        list.forEach(e -> System.out.print(e + " "));
    }
}