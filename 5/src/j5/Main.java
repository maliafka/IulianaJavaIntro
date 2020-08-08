package j5;


public class Main {

    public static void main(String[] args) {
        int j;
        int n;
        n = 12;

        for (j = 2; j <=n; j++) {
            if (isPrime(j))
                System.out.println(j);
        }
    }

    private static boolean isPrime(int m) {


        for (int i = 2; i < m; i++) {
            if (m % i == 0)
                return false;
        }
        return true;

    }
}


