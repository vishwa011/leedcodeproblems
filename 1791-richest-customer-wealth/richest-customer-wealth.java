class Solution {
    public int maximumWealth(int[][] accounts) {
        int max =0;
        for(int[] arr : accounts){
            int sum =0;
            for(int a:arr){
                sum += a;
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}