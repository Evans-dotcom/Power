public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPowerOfTwo(13));
        System.out.println(isPowerOfTwo(41));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(17));

    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
}
