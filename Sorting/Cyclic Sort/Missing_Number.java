class Solution {
    public int missingNumber(int[] array) {
      int i = 0;
        while (i < array.length) {
            if (array[i] < array.length && array[i] != i) {
                int correct = array[i];
                if (array[i] != array[correct]) {
                    swap(array, i, correct);
                } else {
                   i++;
                }
            }else{
                i++;
            }
        }
        return search(array);
    }
        public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    
    public int search(int[] array){
        for (int j = 0; j < array.length; j++) {
           if(array[j] != j){
               return (j);
           }
        }
        return array.length;
    }

}