class Solution {
    public int diagonalSum(int[][] mat) {
        int diganolElementSum=0;
        int len = mat.length-1;
        
        for(int i=0; i<=len; i++)
        {
            for(int j=0; j<mat[i].length; j++)
            {
                if(i==j)
                {
                    diganolElementSum+=mat[i][j];
                }
                else if(i==len-j)
                {
                    diganolElementSum+=mat[i][j];
                }
            }
        }
        
        return diganolElementSum;
        
    }
}
