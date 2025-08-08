class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int j=0; j<n; j++){
                hs.add(matrix[i][j]);
            }
            if(hs.size() !=n){
                return false;
            }
        }
        for(int i=0; i<n; i++){
            HashSet<Integer> hs = new HashSet<Integer>();
            for(int j=0; j<n; j++){
                hs.add(matrix[j][i]);
            }
            if(hs.size() !=n){
                return false;
            }
        }
        return true;
    }
}