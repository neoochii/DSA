class Solution {
    public int findJudge(int n, int[][] trust) {
     
       int[] indegree =new int[n+1];
      
       for(int[] l : trust){
        indegree[l[0]]--;
          indegree[l[1]]++;

       
       }
     
       int ans =-1;
       for(int i =1 ; i< indegree.length;i++){

          if( indegree[i] == n-1 ){
           
            ans = i;

          }


       }
       return ans;
    }
}