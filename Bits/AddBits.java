package com.company.Bits;
public class AddBits {
    public static void main(String[] args) {
//        String a="111",b="111";
//        StringBuilder sb = new StringBuilder();
//        int i = a.length() - 1, j = b.length() -1, carry = 0;
//        while (i >= 0 || j >= 0) {
//            int sum = carry;
//            if (j >= 0) sum += b.charAt(j--) - '0';
//            if (i >= 0) sum += a.charAt(i--) - '0';
//            sb.append(sum % 2);
//            carry = sum / 2;
//        }
//        if (carry != 0) sb.append(carry);
//        sb.reverse();
//        System.out.println(sb);

       int n = 1010110100;
//       String str = Integer.toBinaryString(n);
//       StringBuilder s = new StringBuilder(str);
//       s.reverse();
//        System.out.println(s);
//        int ans = 0;
//        int base = 2;
//        if(s.charAt(0) == '1'){
//            ans = 1;
//        }
//        for (int i = 1; i < s.length(); i++) {
//            ans += base * (s.charAt(i)-'0');
//            base *= 2;
//        }
//        System.out.println(ans);
        int  m = 0;

        for (int i = 0; i < 32; i++, n >>= 1) {
            m <<= 1;
            m |= n & 1;
        }
        System.out.println(m);





















//       char[] a={'1','0','1','0'};
//       char[] b={'1','0','1','1'};
//       char[] temp;
//       if(a.length < b.length){
//           temp = Arrays.copyOf(a,a.length);
//           a = Arrays.copyOf(b,b.length);
//           b = Arrays.copyOf(temp,temp.length);
//       }
//       StringBuilder str = new StringBuilder();
//        //        a.replace(i,i+1,"0");
//        char carry = '0';
//        for (int i =  b.length-1; i>=0; i--) {
//            if(a[i] == '0' && b[i] == '0'){
//                if(carry=='0') {
//                    str.append('0');
//                }
//                else {
//                    str.append('1');
//                    carry='0';
//                }
//            }
//            if(a[i] == '1' && b[i] == '0' || a[i] == '0' && b[i] == '1') {
//                if(carry=='0') {
//                    str.append('1');
//                    carry='0';
//                }
//                else {
//                    str.append('0');
//                    carry='1';
//                }
//            }
//            if(a[i] == '1' && b[i] == '1') {
//                if (carry == '0') {
//                    str.append('0');
//                    carry = '1';
//                } else {
//                    str.append('1');
//                    carry = '1';
//                }
//            }
//        }
//
//        int length = Math.abs(a.length-b.length-1);
//
//        for(int i=length;i>=0;i--){
//            if(a[i] == '1'){
//                if(carry == '1'){
//                str.append('0');
//                carry='1';
//                }else {
//                    str.append('1');
//                    carry='0';
//                }
//            }
//            if(a[i] == '0'){
//                if(carry=='0'){
//                    str.append('0');
//                    carry='0';
//                }else{
//                    str.append('1');
//                    carry='0';
//                }
//            }
//        }
//
//                if(carry=='1')
//                   str.append('1');
//
//        str.reverse();
//
//        System.out.println(str);
//        System.out.println(Integer.toBinaryString(22));



    }
}
