class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }
            return b[1] - a[1];
        });

        for (int key : map.keySet()) {
            pq.offer(new int[]{key, map.get(key)});
        }

        ArrayList<Integer> ans = new ArrayList<>();

        while (k-- > 0) {
            ans.add(pq.poll()[0]);
        }

        return ans;
    }
}
