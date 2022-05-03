public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int gcd(int p, int q) {
        if (q == 0) return p;
        int r = p % q;
        return gcd(r, q);
    }
}