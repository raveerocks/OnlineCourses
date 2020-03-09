# Maximum Consecutive Gap

## Problem Description
You are given an array of N integers, A<sub>1</sub>, A<sub>2</sub> ,..., A<sub>N</sub>.

Return the maximum value of <font color="red">f(i, j)</font> for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.


<div class="text-purple">
  This text is purple, <a href="#" class="text-inherit">including the link</a>
</div>

**Return 0 if the array contains less than 2 elements.**   

## Problem Constraints
```
1 <= N <= 1000000 1 <= A[i] <= 1e9 
```

## Input Format
```
First argument is an integer array A of size N.
```

## Output Format
```
Return an integer denoting the maximum difference.
```
## For Example
```
Input 1:
    A = [1, 10, 5]
Output 1:
    5
```

## Example Explanation
```
After sorting, the array becomes [1, 5, 10]
Maximum difference is (10 - 5) = 5.
```

