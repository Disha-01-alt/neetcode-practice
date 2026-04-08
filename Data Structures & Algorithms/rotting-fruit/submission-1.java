class Solution {
    public int orangesRotting(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int fresh=0;
        int minutes=-1;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    fresh+=1;
                }
            }
        }
        if(fresh==0){
            return 0;
        }
        int[][] directions={{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int size=q.size();
            minutes+=1;
            for(int k=0;k<size;k++){
                int[] curr=q.poll();
                for(int[] a:directions){
                    int p=curr[0]+a[0];
                    int s=curr[1]+a[1];
                    if(p>=0 && s>=0 && p<m && s<n && grid[p][s]==1){
                        grid[p][s]=2;
                        fresh-=1;
                        q.add(new int[]{p,s});
                    }
                }
            }
        }
        if(fresh==0){
            return minutes;
        }
        else{
            return -1;
        }
        
        
    }
}

