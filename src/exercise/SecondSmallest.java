package exercise;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class SecondSmallest {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void main(String[] args) {
        System.out.println(parallel(new int[]{1, 7, 4, 3, 6}));
        System.out.println(parallel(new int[]{6, 1, 4, 3, 5, 2, 1}));
        System.out.println(parallel(new int[]{6, 1, 1, 1, 1, 1, 1, 2, 1}));
    }

    private static class TwoSmallest {
        public int smallest;
        public int secondSmallest;

        public TwoSmallest() {
            this.smallest = Integer.MAX_VALUE;
            this.secondSmallest = Integer.MAX_VALUE;
        }
    }

    public static TwoSmallest sequential(int[] arr, int lo, int hi) {
        TwoSmallest result = new TwoSmallest();

        for (int i = lo; i < hi; i++) {
            TwoSmallest temp = new TwoSmallest();
            temp.smallest = arr[i];
            result = combine(result, temp);
        }
        return result;
    }

    public static int parallel(int[] arr) {
        return -1; //implement me
    }

    //combine 4 numbers from parameter a and parameter b (which may contain dupes)
    //and return two smallest numbers
    public static TwoSmallest combine(TwoSmallest a, TwoSmallest b) {
        return null; //implement me
    }

    private static class SecondSmallestTask extends RecursiveTask<TwoSmallest> {
        //add fields

        //add constructor

        @Override
        protected TwoSmallest compute() {
            return null; //implement me
        }
    }
}