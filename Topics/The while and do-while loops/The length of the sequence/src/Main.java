import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int output = 0;
        while (scanner.hasNext()) {
            if (scanner.nextInt() == 0) {
                break;
            } else {
                output++;
            }
        }
        System.out.println(output);
    }
}