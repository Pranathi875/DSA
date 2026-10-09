import java.util.*;
class dfs_prac{
    static List<Integer>dfs=new ArrayList<>();
    public static void main(String args[]){
      
       ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
       
       int n=5;
       for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
       }
       adj.get(0).add(1);
       adj.get(1).add(0);

       adj.get(0).add(2);
       adj.get(2).add(0);

       adj.get(0).add(4);
       adj.get(4).add(0);

       adj.get(3).add(4);
       adj.get(4).add(3);

      int visited[]=new int[n+1];
      
       int start=0;
       dfsOfGraph(adj,visited,start);
       System.out.println(dfs);
       
    }
    public static void dfsOfGraph(ArrayList<ArrayList<Integer>>adj,int visited[],int node){
        visited[node]=1;
        dfs.add(node);
        for(Integer it:adj.get(node)){
            if(visited[it]!=1){
                dfsOfGraph(adj,visited,it);
            }
        }

    }
}
