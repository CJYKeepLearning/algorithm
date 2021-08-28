public class dpStone {
    public static void main(String[] args) {

    }
    public static int stoneGame(int[] piles){
        int n = piles.length;
        Pair[][] dp = new Pair[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                dp[i][j] = new Pair(0,0);
        }
        //base case
        for (int i=0;i<n;i++){
            dp[i][i].fir = piles[i];
            dp[i][i].sec = 0;
        }
        //斜着遍历数组
        for (int l=2;l<=n;l++){
            for(int i=0;i<=n-1;i++){
                int j = l+i-1;
                //先手选择最左边或最右边的分数
                int left = piles[i]+dp[i+1][j].sec;
                int right = piles[j]+dp[i][j-1].sec;
                //套用状态转移方程
                if (left>right){
                    dp[i][j].fir = left;
                    dp[i][j].sec = dp[i+1][j].fir;
                }else {
                    dp[i][j].fir = right;
                    dp[i][j].sec = dp[i][j-1].fir;
                }
            }
        }
        Pair res = dp[0][n-1];
        return res.fir-res.sec;
    }
}
class Pair{
    int fir,sec;
    Pair(int fir,int sec){
        this.fir = fir;
        this.sec = sec;
    }
}
