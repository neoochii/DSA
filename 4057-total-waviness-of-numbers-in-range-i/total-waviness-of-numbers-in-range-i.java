class Solution {
    public int totalWaviness(int num1, int num2) {

        int sol = 0;

        for (int j = num1; j <= num2; j++) {

            String s = String.valueOf(Math.abs(j));

            if (s.length() < 3)
                continue;

            for (int i = 1; i < s.length() - 1; i++) {

                int prev = s.charAt(i - 1) - '0';
                int curr = s.charAt(i) - '0';
                int next = s.charAt(i + 1) - '0';

                if ((curr > prev && curr > next) ||
                    (curr < prev && curr < next)) {

                    sol++;
                }
            }
        }

        return sol;
    }
}