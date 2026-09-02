class SummaryRanges {
    Set<Integer> st;

    public SummaryRanges() {
        st = new HashSet<>();
    }

    public void addNum(int value) {
        st.add(value);
    }

    public List<List<Integer>> getIntervals() {
        List<Integer> nums = new ArrayList<>(st);
        Collections.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.size();

        for (int i = 0; i < n; i++) {
            int start = nums.get(i);

            while (i < n - 1 && nums.get(i) + 1 == nums.get(i + 1)) {
                i++;
            }

            result.add(Arrays.asList(start, nums.get(i)));
        }

        return result;
    }
}