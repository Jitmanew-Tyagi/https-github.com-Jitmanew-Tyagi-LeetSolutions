class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        for(int i = 0; i < n; i ++) cnc(grid, i, 0);
        for(int i = 0; i < n; i ++) cnc(grid, i, m - 1);
        for(int i = 0; i < m; i ++) cnc(grid, 0, i);
        for(int i = 0; i < m; i ++) cnc(grid, n - 1, i);
        
        int ans = 0;
        
        for(int i = 1; i < n - 1; i ++) {
            for(int j = 1; j < m - 1; j ++) {
                if(grid[i][j] == 1) ans += cnc(grid, i, j);
            }
        }
        return ans;
    }
    
    public int cnc(int[][] arr, int i, int j) {
        if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0) return 0;
        arr[i][j] = 0;
        int ans = 1;
        ans += cnc(arr, i + 1, j);
        ans += cnc(arr, i, j + 1);
        ans += cnc(arr, i - 1, j);
        ans += cnc(arr, i, j - 1);
        return ans;
    }
    
}