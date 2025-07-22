class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder Merge = new StringBuilder();
        int Mergelegnth = Math.max(word1.length(),word2.length());

        for(int i=0; i<Mergelegnth; i++){
            if(i<word1.length()){
                Merge.append(word1.charAt(i));
            }
            if(i<word2.length()){
                Merge.append(word2.charAt(i));
            }
        }
        return Merge.toString();
    }
}