class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        boolean[] present = new boolean[100001];
        for(int i:arr){
            present[i] = true;
        }
        for(int i = start;i<=end;i++) {
            if(!present[i]) return false;
        }
        return true;
    }
}