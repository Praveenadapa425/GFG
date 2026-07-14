class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int i =0 , j=0;
        int m = a.length,n = b.length;
        while(i<m && j<n){
            if(a[i] <= b[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != a[i]){
                    list.add(a[i]);
                    
                }
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size() - 1) != b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
         while (i < a.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != a[i]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < b.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != b[j]) {
                list.add(b[j]);
            }
            j++;
        }
        return list;
    }
}
