public class App
{
    enum Category {
        ALGO,
        DATABASE,
        OOP,
        NETWORK
    }

    private static boolean isPrime(long n) {
        for (long i=2; i<n; i++)
            if (n % i == 0) return false;
        return true;
    }

    private static long largestPrimeFactor(long n) {
        long largest = 2;
        long i = 2;

        while (i < n) {
            if (n % i == 0) {
                String prime = "no";
                if (isPrime(i)) {
                    prime = "yes";
                    largest = i;
                }
                System.out.println("Factor: " + i + " => Prime: " + prime);
            }
            i++;
        }

        return largest;
    }

    public static void main(String[] args) {
        Category cat = Category.ALGO;
        System.out.println("*** Exo4 - category: " + Category.ALGO + "***");
        //long n = 600851475143L;
        long n = 10086647;
        System.out.print("Largest Prime Factor found: " + largestPrimeFactor(n));
        //System.out.print(isPrime(Integer.parseInt(args[0])));
        //largestPrimeFactor(n);
    }
}