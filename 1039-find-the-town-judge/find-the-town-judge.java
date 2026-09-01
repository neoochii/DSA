class Solution {
    public int findJudge(int n, int[][] trust) {
       ArrayList<Integer> res = new ArrayList<>();
       int[] indegree =new int[n+1];
       int[] outdegree=new int[n+1];
       for(int[] l : trust){
        indegree[l[0]]++;
        outdegree[l[1]]++;
       }
       int result = outdegree[1];
       int ans =-1;
       for(int i =1 ; i< outdegree.length;i++){

          if( outdegree[i] == n-1 && indegree[i] ==0){
           
            ans = i;

          }


       }
       return ans;
    }
}