class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]==1&&i!=j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        int vis[]=new int[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
           if(vis[i]!=1){
              count++;
              bfs(adj,vis,i);
           }
        }

      return count;
    }
    public static void bfs(ArrayList<ArrayList<Integer>>adj,int []vis,int start){
          Queue<Integer>q=new LinkedList<>();
          q.add(start);
           vis[start]=1;
          while(!q.isEmpty()){
              Integer node=q.poll();
             for(Integer it:adj.get(node)){
                 if(vis[it]!=1){
                   q.add(it);
                   vis[it]=1;
                 }
               }
           }
    }
}
