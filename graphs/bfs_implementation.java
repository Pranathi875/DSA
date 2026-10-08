import java.util.*;
class bfs_prac{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=9;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());

        }
        adj.get(1).add(6);
        adj.get(1).add(2);
        adj.get(6).add(1);
        adj.get(2).add(1);

        
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(2).add(4);
        adj.get(4).add(2);

        adj.get(4).add(5);
        adj.get(5).add(4);
        adj.get(5).add(8);
        adj.get(8).add(5);

        
        adj.get(1).add(7);
        adj.get(7).add(1);
        adj.get(1).add(9);
        adj.get(9).add(1);

        adj.get(8).add(7);
        adj.get(7).add(8);
        adj.get(7).add(6);
        adj.get(6).add(7);

        adj.get(6).add(9);
        adj.get(9).add(6);

        Queue<Integer>q=new LinkedList<>();
        ArrayList<Integer>bfs=new ArrayList<>();
        int visited[]=new int[n+1];
        q.add(1);
        visited[1]=1;
        while(!q.isEmpty()){
            Integer val=q.poll();
            bfs.add(val);
            for(Integer it:adj.get(val)){
                if(visited[it]!=1){
                    q.add(it);
                    visited[it]=1;
                }
            }


        }
        System.out.println(bfs);

        


    }
}

