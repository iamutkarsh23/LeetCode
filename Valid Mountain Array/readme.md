# Valid Mountain Array

Check out the [problem](https://leetcode.com/problems/valid-mountain-array/)

Optimal solution - soln1.java

## My Strategy  

I broke down the problem to various parts. 

- What is a mountin array? 
  - A is a mountain array if and only if:
    - A.length >= 3
    - There exists some i with 0 < i < A.length - 1 such that:
       - A[0] < A[1] < ... A[i-1] < A[i]
       - A[i] > A[i+1] > ... > A[A.length - 1]

- Check if there is an increasing order from the start of the array
- Record where the increasing order stops 
```
If the position after the increasing order is the first or last, then there are only one or two elements in the array
```
- Now check if there is a decreasing order from that position in the array to the end 
- Return true if all these are met 
