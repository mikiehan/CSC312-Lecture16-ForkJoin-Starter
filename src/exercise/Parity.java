package exercise;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Parity {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void main(String[] args) {
        System.out.println(parallel(new int[] {1, 7, 4, 3, 6}));
        System.out.println(parallel(new int[] {6, 5, 4, 3, 2, 1}));
    }

    private static boolean sequential(int[] arr, int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            if (arr[i] % 2 == 0) {
                count += 1;
            }
        }
        return count % 2 == 0;
    }

    public static boolean parallel(int[] arr) {
        return false; //implement me
    }

    private static class ParityTask extends RecursiveTask<Boolean> {
        //add instance fields

        //add constructor

        @Override
        protected Boolean compute() {
            return false; //implement me
        }
    }
}