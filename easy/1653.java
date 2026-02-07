class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int del = 0;

        for(char c : s.toCharArray()){
            if(c == 'b'){
                bCount++;
            } else {
                del = Math.min(del + 1, bCount);
            }
        }
        return del;
    }
}
