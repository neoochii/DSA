class Solution {
    public int totalWaviness(int num1, int num2) {

        int sol = 0;

        for (int num = num1; num <= num2; num++) {

            int x = Math.abs(num);

            if (x < 100) continue; // less than 3 digits

            while (x >= 100) {

                int right = x % 10;
                int curr = (x / 10) % 10;
                int left = (x / 100) % 10;

                if ((curr > left && curr > right) ||
                    (curr < left && curr < right)) {
                    sol++;
                }

                x /= 10;
            }
        }

        return sol;
    }
}