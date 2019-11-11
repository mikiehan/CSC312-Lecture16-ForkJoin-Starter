package lecture;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinSumArray {
    //Add the most important line here

    public static void main(String[] args) {
        SimpleTimer timer = new SimpleTimer();

        long[] input = makeInput(500000);
        //System.out.println("The input is " + java.util.Arrays.toString(input) + ".");
        timer.start();
        System.out.println("Correct answer is " + sequentialSum(input, 0, input.length) + ".");
        timer.stop();
        timer.start();
        System.out.println("My answer is " + sum(input) + ".");
        timer.stop();
    }

    public static final Random RAND = new Random();
    public static long[] makeInput(int length) {
        long arr[] = new long[length];
        for (int i = 0; i < length; i++) {
            arr[i] = RAND.nextInt(Integer.MAX_VALUE / 10000);
        }
        return arr;
    }

    public static long sequentialSum(long[] arr, int lo, int hi) {
        long result = 0;
        for (int i = lo; i < Math.min(arr.length, hi); i++) {
            result += arr[i];
        }
        return result;
    }

    private static final int CUTOFF = 10000;

    static class SumTask extends RecursiveTask<Long> {
        //add fields


        //add construcotr

        @Override
        public Long compute() {
            return 0L; //implement me
        }

    }

    public static long sum(long[] arr) {
        return 0L; //implement me
    }
}