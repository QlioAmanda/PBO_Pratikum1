public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        
        // Math.round(x) mengembalikan nilai long.
        // Karena variabel nx bertipe int, diperlukan casting eksplisit (int).
        int nx = (int) Math.round(x);

        System.out.println("Nilai x: " + x);
        System.out.println("Nilai nx setelah dibulatkan dan di-cast: " + nx);
        
        // Penjelasan:
        // 1. Math.round(92.98) membulatkan nilai menjadi 93.
        // 2. Tipe data yang dikembalikan oleh Math.round() adalah long, yaitu 93L.
        // 3. (int) 93L melakukan konversi (casting) dari long ke int, menghasilkan 93.
    }
}