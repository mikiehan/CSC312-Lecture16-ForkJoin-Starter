package exercise;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class PowMod {
    private static final ForkJoinPool POOL = new ForkJoinPool();
    private static final int CUTOFF = 1;

    public static void main(String[] args) {
        int[] arr = new int[] {1, 7, 4, 3, 6};
        parallel(arr, 6, 5000);
        System.out.println(Arrays.toString(arr));
    }

    public static void sequential(int[] arr, int pow, int mod, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            int result = 1;
            for (int p = 0; p < pow; p++) {
                result = (result * arr[i]) % mod;
            }
            arr[i] = result;
        }
    }

    public static void parallel(int[] arr, int pow, int mod) {
        return; //implement me
    }

    private static class PowModTask extends RecursiveAction {
        //add fields

        //add constructor

        @Override
        protected void compute() {
            //implement me
        }
    }
}