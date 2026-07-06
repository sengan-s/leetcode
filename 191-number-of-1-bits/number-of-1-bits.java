class Solution {
    public int hammingWeight(int n) {
          String b = Integer.toBinaryString(n);
          int count=0;
          for(int i=0;i<=b.length()-1;i++){
            if(b.charAt(i)=='1'){

                count++;
            }
          }
          return count;
    }
}