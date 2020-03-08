package com.raveerocks.scaler;

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {

        int n = A.length;
        int maxLeftHeight[] = new int [n];
        int maxRightHeight[] = new int [n];
        int currentLeftHeight,currentRightHeight;
        int totalWaterAccumulated=0;

        // Scanning through the array to find the maxLeftHeight for each gap
        currentLeftHeight=0;
        for(int i=0;i<n;i++){
            maxLeftHeight[i]= currentLeftHeight;
            if(currentLeftHeight<A[i]){
                currentLeftHeight=A[i];
            }
        }

        // Scanning through the array to find the maxLeftHeight for each gap
        currentRightHeight=0;
        for(int i=n-1;i>=0;i--){
            maxRightHeight[i]= currentRightHeight;
            if(currentRightHeight<A[i]){
                currentRightHeight=A[i];
            }
        }
        for(int i=0;i<n;i++){
            totalWaterAccumulated += Math.max(0,Math.min(maxLeftHeight[i],maxRightHeight[i])-A[i]);
        }
        return totalWaterAccumulated;
    }
}
