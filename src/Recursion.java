public class Recursion {
    public static void main(String[] args) {
        var we = fibi(4);
        System.out.println(we);
    }

    static int fibi(int n) {
        if (n >= 3) {
            return fibi(n-1) + fibi(n-2);
        } else {
            return 1;
        }
    }
}
