package exercise;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class LessThan7 {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void main(String[] args) {
        int[] arr = new int[] {21, 7, 6, 8, 17, 1, 7, 7, 1, 1, 7};
        System.out.println(parallel(arr));
    }

    public static int sequential(int[] arr, int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            if (arr[i] < 7) {
                count += 1;
            }
        }
        return count;
    }

    public static int parallel(int[] arr) {
        return -1; //implement me
    }

    private static class LessThan7Task extends RecursiveTask<Integer> {
        //add fields

        //add constructor

        @Override
        protected Integer compute() {
            return -1; //implement me
        }

    }
}