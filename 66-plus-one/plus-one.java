class Solution {
    public int[] plusOne(int[] digits) {
       int n = digits.length;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Increment the current digit
            digits[i]++;
            
            // If the digit is less than 10, we're done.
            if (digits[i] < 10) {
                return digits;
            }
            
            // Otherwise, it was a 9, which became 10. Set it to 0 and carry over.
            digits[i] = 0;
        }

        // If we get here, it means the whole number was 9s (e.g., 99 -> 100)
        // We need a new array with one more digit.
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1; // The first digit is 1, the rest are 0 by default.
        
        return newNumber;
    }
}