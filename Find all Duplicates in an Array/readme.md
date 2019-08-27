# Find all Duplicates in an Array 

Check out the [problem](https://leetcode.com/problems/find-all-duplicates-in-an-array/)

Optimal solution - soln2.java

## My Strategy  

There are many approaches but here are the two I encountered. 

### First approach 

- Store all the elements of array in a hashmap with the key being the number of occurences 
- Now add the elements whose key is greater than 1 to an ArrayList 
- The arraylist will now contain the duplicate numbers 

### Second approach 

- Loop through the array and negate the number at specific indexes
- If we encounter it another time to negate it, it occurs twice
