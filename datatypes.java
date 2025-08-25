public class datatypes {
    public static void main(String[] args) {
        long[] testCases = { -150, 150000, 1500000000L, 2133333333333333333L, -100000000000000L };

        for (long n : testCases) {
            try {
                System.out.println(n + " can be fitted in:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");
            } catch (Exception e) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
    }
}