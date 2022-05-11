import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] seq = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();
        String[] out = new String[seq.length];

        for (int i = 0; i < seq.length; i++) {
            out[(i + shift) % seq.length] = seq[i];
        }

        System.out.println(String.join(" ", out));
    }
}