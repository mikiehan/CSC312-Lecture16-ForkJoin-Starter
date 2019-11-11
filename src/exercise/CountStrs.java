package exercise;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class CountStrs {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void main(String[] args) {
        String[] arr = new String[] {"h", "ee", "llll", "llll", "oo", "llll"};
        System.out.println(parallel(arr, "llll"));
        System.out.println(parallel(arr, "h"));
    }

    public static int sequential(String[] arr, String str, int lo, int hi) {
        int count = 0;
        for (int i = lo; i < hi; i++) {
            if (arr[i].equals(str)) {
                count += 1;
            }
        }
        return count;
    }

    public static int parallel(String[] arr, String str) {
        return -1; //implement me
    }


    private static class CountStrsTask extends RecursiveTask<Integer> {
        //add instance fields

        //add constructor

        @Override
        protected Integer compute() {
            return -1; //implement me
        }
    }
}