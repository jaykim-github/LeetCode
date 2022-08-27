class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] arr = new int[grid.length-2][grid.length-2];
        
        for(int i = 0; i<arr.length;i++){
            for(int j =0; j<arr.length; j++){
                int max = Integer.MIN_VALUE;
                
                for(int k = i; k<i+3; k++){
                    for(int l = j; l<j+3; l++){
                        max= Math.max(max,grid[k][l]);
                    }
                }
                
                
                arr[i][j] = max;
            }
        }
            
            
        return arr;
    }
}