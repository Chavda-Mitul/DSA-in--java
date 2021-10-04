import java.util.ArrayList;
import java.util.List;

public class LuckeyNumber {
    public static void main(String[] args) {
        int ans = mySqrt(5);
        System.out.println(ans);

    }
    public static int mySqrt(int x) {
        int start = 0, end = x, mid = 0, ans = 0;
        while (start <= end) {
            mid = (start + end) / 2;
            if (mid * mid > x) {
                end = mid;
            } else if (mid * mid < x) {
                start = mid;
            } else if (mid * mid == x) {
                return mid;
            }
        }
        return mid;
    }
}
