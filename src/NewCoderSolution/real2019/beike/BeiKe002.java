package NewCoderSolution.real2019.beike;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-10  -19:17
 * @title BeiKe002
 * @project MyBookCodes
 * @desc TODO
 */
public class BeiKe002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(getLongestIncList(arr));


    }

    private static int getLongestIncList(int[] nums) {

        if(nums.length==0||nums==null) return 0;
        if(nums.length==1) return 1;
        int[] dp=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++ ){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            max=Math.max(dp[i],max);
        }
        return max;
    }
}