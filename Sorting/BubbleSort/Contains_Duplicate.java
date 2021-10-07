//https://leetcode.com/problems/contains-duplicate/
class Solution {
    public boolean containsDuplicate(int[] array) {
          Arrays.sort(array);
         for(int k=1;k<array.length;k++){
            if(array[k] == array[k-1]){
                return true;
            }
        }
        return false;
       
    }  
}
