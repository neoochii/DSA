class Solution {
    public int minPartitions(String n) {
         int max_digit = -1;
          for (char character : n.toCharArray()) {
            if (Character.isDigit(character)) {
                int digit_value = Character.getNumericValue(character);
                if (digit_value > max_digit) {
                    max_digit = digit_value;
                }
            }
        }
        return max_digit; // Returns -1 if no digits were found
    }
}