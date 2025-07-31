class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // int n = arr.length;

        // for(int i=0;i<n;i++){
        //     if(i != 2){
        //         return true;
        //     }else if(i%2==0){
        //         return false;
        //     }
        // }
        // return false;

        Arrays.sort(arr);
        int diff = arr[1]- arr[0];

        for(int i=2; i<arr.length; i++){
            if(arr[i] - arr[i-1] != diff){
                return false;
            }
        }
        return true;
    }
}