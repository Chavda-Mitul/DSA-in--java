package com.company.Bits;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
//        System.out.println(Gap(n));
//        System.out.println(GapDoneByArray(n));
//        System.out.println("🤣🤦‍♀️👍");
        System.out.println((4&1) == 0);
    }

   public static int GapDoneByArray(int n)
   {
       int t = 0;
       int[] array = new int[32];
       for(int i=0;i<array.length;i++)
       {
           if((n&1) != 1)
           {
               array[t++] = i;
           }
           n = n>>1;
       }
       int ans = 0;
       for(int i=0;i<t-1;i++)
       {
           ans = Math.max(ans,array[i+1]-array[i]);
       }
       return ans;
   }
    public static int Gap(int n)
    {
        if(Integer.bitCount(n)<2)
        {
            return 0;
        }
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        int ct;
        int ans = 0;
//        boolean flag1 = false;
        boolean flag2 = false;
        for(int i=0;i<str.length();i++)
        {
            ct = 0;
            if(str.charAt(i) == '1')
            {
//                flag1 = true;
                for(int j=i+1;j<str.length();j++)
                {
                    if(str.charAt(j) == '0')
                    {
                        ct++;
                    }
                    else{
                        flag2 = true;
                        break;
                    }
                }
                if(flag2)
                    ans = Math.max(ct,ans);
            }
            flag2 = false;
        }
        return ans+1;
    }
}
