public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
            int a[]=new int[2];
            Arrays.sort(A);
            int diff=A[1]-A[0];
            for(int i=0;i<A.length;i++)
            {
                while(A[i]!=A.length)
                {
                if(A[i]-A[i+1]==0)
                {
                    a[0]=A[i];
                    a[1]=A[i]+diff;
                }
                }
            }
            return a;
    }
}
