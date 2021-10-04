public class Mountain {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6};
        int target = 2;
        int ans = peakIndexInMountainArray(arr,target);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr,int target) {
        int s=0,e=arr.length-1,mid;
        while(s<=e)
        {
            mid = (s + e)/2;
            if(target > arr[mid]) {
                s = mid + 1;
            } else if(target == mid) {
                return mid;
            } else{
                e = mid - 1;
            }
        }
        return -1;
    }
}
