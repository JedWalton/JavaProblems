import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.System.in;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(in);

        System.out.println(Collections.frequency(
                Stream.of(scanner.nextLine().split("\\s"))
                        .collect(Collectors.toCollection(ArrayList::new)),
                scanner.nextLine()
            )
        );
    }
}