public class Cealing_Binarysearch {
    public static void main(String[] args) {
        //return a number which is grater than or equal to target element.
        int target = 14;
        int[] arr = {2,3,5,9,14,16,18};
        int ans = Ceiling_of_a_number(arr,target);
//       int ans  =  Floor_of_a_number(arr,target);
        System.out.println(ans);
    }
    public static int  Ceiling_of_a_number(int[] arr, int target)
    {
        int s=0,e=arr.length-1,mid;
        while(s<=e)
        {

            mid = (s+e)/2;
            if(arr[mid]>=target) {
                e = mid -1;
            }
            else
            {
                s = mid+1;
            }
        }
        return arr[s];
    }


    public static int  Floor_of_a_number(int[] arr, int target)
    {
        int s=0,e=arr.length-1,mid;
        while(s<=e)
        {
            mid = (s + e ) / 2;
            if(arr[mid] < target)
            {
                s = mid + 1;
            }
            else if(arr[mid] == target)
            {
                return arr[mid];
            }
            else
            {
                e = mid - 1;
            }
        }
        return arr[e];
    }
}
