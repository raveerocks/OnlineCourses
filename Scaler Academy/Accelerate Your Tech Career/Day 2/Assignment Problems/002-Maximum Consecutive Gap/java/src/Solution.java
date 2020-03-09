package src;

import src.Bucket;

public class Solution {
    public int maximumGap(final int[] A) {

        if (A == null || A.length < 2) {
            return 0;
        }

        int n = A.length;

        int min = A[0];
        int max = A[0];

        // Scanning through the array to find the minimum and maximum element
        for (int i = 0; i < n; i++) {
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }

        Bucket[] buckets = new Bucket[n + 1];

        // Initializing the buckets
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Bucket();
        }

        double range = (double) n / (max - min);

        // Mapping each element to its respective bucket and updating min and max
        for (int i = 0; i < n; i++) {
            int index = (int) ((A[i] - min) * range);

            if (buckets[index].min == -1) {
                buckets[index].min = A[i];
                buckets[index].max = A[i];
            } else {
                buckets[index].min = Math.min(buckets[index].min, A[i]);
                buckets[index].max = Math.max(buckets[index].max, A[i]);
            }
        }

        int maxGap = 0;
        int last = buckets[0].max;
        for (int i = 1; i < buckets.length; i++) {
            if (buckets[i].min != -1) {
                maxGap = Math.max(maxGap, buckets[i].min - last);
                last = buckets[i].max;
            }
        }

        return maxGap;

    }

}