public class First_Last_Index {
    public static void main(String[] args) {
    int[] nums = {5,7,7,8,8,8,10,11};
    int target = 8;
    int ans[] = searchRange(nums,target);
        System.out.println(ans[0] + " " + ans[1]);

    }
     public static int[] searchRange(int[] arr, int target)
     {
            int[] nums =  {-1,-1};
            int s = search(arr,target,true);
            int e = search(arr,target,false);
            nums[0] = s;
            nums[1] = e;
            return nums;
     }

     public static int search(int[] arr, int target, boolean forstart)
    {
        int s=0,e=arr.length-1,mid,ans=0;
        while(s<=e) {
            mid = (s+e)/2;
            if (arr[mid] > target) {
                s = mid + mid + 1;
            } else if (arr[mid] < target) {
                e = mid - 1;
            } else {
                ans = mid;
                if(forstart) {
                   e = mid - 1;
               } else {
                   s = mid + 1;
               }
            }
        }
        return ans;
    }


}
