class Solution {
    public int[] twoSum(int[] numbers, int target) {
      
        int start =0;
        int second = numbers.length -1;

        while(start< second){
               int sum = numbers[start] + numbers[second];
            if(sum == target){
                 return new int[] {start + 1, second + 1};

            }else if(sum < target){
                start++;
            }else{
                second--;
            }
        }
          return new int[] {-1, -1}; 


       
        
    }
}