class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
            LinkedList<Integer> res = new LinkedList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            res.addFirst(k % 10);
            k /= 10;
        }

        return res;
    }
}