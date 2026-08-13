class Solution {

    public int[] getleftmax(int[] height , int n){
        int[] result = new int[n];
        result[0] = height[0];
        

        for(int i = 1 ; i< n ; i++){

            result[i] = Math.max(result[i -1], height[i]);

        }
        return result;




    }
     public int[] getrightmax(int[] height , int n){
        int[] result = new int[n];
        result[n-1] = height[n-1];
        

        for(int i = n -2 ; i>= 0; i--){

            result[i] = Math.max(result[i +1], height[i]);

        }
        return result;



    }
    public int trap(int[] height) {
        int n = height.length;
        int[] leftmax= getleftmax(height, n);
        int[] rightmax= getrightmax(height, n);
        int sum =0;


        for(int i = 0 ; i <n ;i++ ){
             int h = Math.min(leftmax[i] , rightmax[i]) - height[i];

             sum += h;
        }
        return sum;
    }
}