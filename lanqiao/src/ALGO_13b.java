public class ALGO_13b {
    public static int count;
    public static void main(String[] args) {
        int[] a = {389,207,155,300,299,170,158,65};
        int i = solve(a);
        System.out.println(i);

    }
    public static int solve(int[] nums){
        int[] dp = new int[nums.length];
        int[] c  = new int[nums.length];
        dp[0] = 1;
        c[0] = -1;
        for (int i=1;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[j]>nums[i]){
                    if (dp[j]+1>dp[i]){
                        dp[i] = dp[j]+1;
                        c[i] = j;
                    }
                }
            }
        }
        int res = 0,index=0;
        for (int i=0;i<dp.length;i++){
            if (dp[i]>res){
                res = dp[i];
                index = i;
            }

        }
        for (int i=0;i<nums.length;i++){

        }
        return res;
    }
}
