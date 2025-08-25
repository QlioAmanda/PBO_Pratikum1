import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan string A:");
        String A = scanner.next();

        System.out.println("Masukkan string B:");
        String B = scanner.next();

        // 1. Menjumlahkan panjang string A dan B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Menentukan apakah A lebih besar secara leksikografis dari B
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Mengkapitalisasi huruf pertama dari A dan B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}