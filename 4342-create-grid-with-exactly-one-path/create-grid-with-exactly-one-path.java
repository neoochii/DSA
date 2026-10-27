class Solution {
    public String[] createGrid(int m, int n) {
       
       String[] g = new String[m];
        
      for (int i = 0; i < m; i++) {
            if (i == 0) {
                
             g[i] = ".".repeat(n);
            } else {
            
               g[i] = "#".repeat(n - 1) + ".";
            }
        }
        
        return g;
    }
}