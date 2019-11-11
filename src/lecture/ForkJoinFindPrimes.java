package lecture;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinFindPrimes {
    public static final ForkJoinPool POOL = new ForkJoinPool();
    public static final int LOWER_BOUND = 0;
    public static final int UPPER_BOUND = 10000000;
    public static final int CUTOFF = 100;

    private static boolean isPrime(long num) {
        if (num < 2) {
            return false;
        }
        else if (num == 2) {
            return true;
        }
        else if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int sequentialNumberOfPrimes(int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    @SuppressWarnings("serial")
    static class PrimeFinderTask extends RecursiveTask<Integer> {
        //add fields

        //add constructor

        @Override
        protected Integer compute() {
            return 0; //implement me
        }

    }

    public static int numberOfPrimes() {
        return 0; //implement me
    }

    public static void main(String[] args) {
        SimpleTimer timer = new SimpleTimer();

        System.out.println("Sequential:");
        timer.start();
        System.out.println("There are " + sequentialNumberOfPrimes(LOWER_BOUND, UPPER_BOUND)
                + " primes between " + LOWER_BOUND + " and " + UPPER_BOUND
                + ".");
        timer.stop();

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Parallel:");
        timer.start();
        System.out.println("There are " + numberOfPrimes() + " primes between "
                + LOWER_BOUND + " and " + UPPER_BOUND + ".");
        timer.stop();

    }

}