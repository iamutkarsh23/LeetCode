class Solution {
    public boolean validMountainArray(int[] A) {
        int arrLen = A.length;
        // pointer to check the array
        int i=0;

        // checking if the next element is less than the current (checking increasing order)
        while (i<arrLen-1 && A[i] < A[i+1]){
            i++;
        }
        
        // if i==0 then there is only one element in the array 
        // and if i==length then there are just two elements 
        if(i==0 || i==arrLen-1){
            return false;
        }

        // checking if next elements are in a decreasing order\
        while (i<arrLen-1 && A[i] > A[i+1]){
            i++;
        }

        return i == arrLen-1;
        
    }
}