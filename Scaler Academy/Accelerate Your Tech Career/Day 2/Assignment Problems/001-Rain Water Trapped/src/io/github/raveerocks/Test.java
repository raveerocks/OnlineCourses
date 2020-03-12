package io.github.raveerocks;

public class Test {
    public static void main(String[] args) {
        int A[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Solution solution = new Solution();
        System.out.println("Total Water accumulated :" + solution.trap(A));
    }
}
