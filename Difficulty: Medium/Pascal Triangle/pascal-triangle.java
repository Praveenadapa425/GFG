class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        long val = 1;

        ans.add(1);

        for (int i = 1; i < n; i++) {
            val = val * (n - i);
            val = val / i;
            ans.add((int) val);
        }

        return ans;
    }
}