class ConvertDataType {
    // Mengoreksi nama parameter dari '1' menjadi 'l'
    static short methodOne(long l) {
        int i = (int) l;
        return (short) i;
    }

    public static void main(String[] args) {
        double d = 10.25;
        
        float f = (float) d;
        
        // Memanggil methodOne dengan casting dari float ke long
        // methodOne((long) f) -> methodOne(10L) -> mengembalikan 10
        byte b = (byte) methodOne((long) f);

        System.out.println("Nilai d: " + d);
        System.out.println("Nilai f: " + f);
        System.out.println("Nilai b: " + b);

        // Penjelasan:
        // 1. double d = 10.25
        // 2. float f = (float) 10.25 -> f = 10.25f (terjadi narrowing conversion)
        // 3. (long) f -> (long) 10.25f -> 10L (bagian desimal hilang)
        // 4. methodOne(10L) dipanggil.
        // 5. di dalam methodOne, int i = (int) 10L -> i = 10.
        // 6. return (short) 10 -> mengembalikan 10.
        // 7. byte b = (byte) 10 -> b = 10. Nilai 10 berada dalam rentang byte (-128 hingga 127).
    }
}