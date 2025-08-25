public class Constants2 {
    // Menggunakan public static final untuk konstanta kelas
    public static final double CM_PER_INCH = 2.54;

    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;

        // Mencetak hasil perhitungan.
        System.out.println("Paper size in centimeters: " +
                (paperWidth * CM_PER_INCH) + " by " + (paperHeight * CM_PER_INCH));
    }
}