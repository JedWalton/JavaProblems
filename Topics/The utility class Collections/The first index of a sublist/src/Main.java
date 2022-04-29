import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = List.of(scanner.nextLine().split("\\s"));
        List<String> list1 = List.of(scanner.nextLine().split("\\s"));
        System.out.println(Collections.indexOfSubList(list, list1) + " " +
                Collections.lastIndexOfSubList(list, list1));
    }
}