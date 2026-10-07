class Solution {
    public int[] findMode(TreeNode root) {
        if(root==null){
            return null;
        }
       List<Integer>ls=new ArrayList<>();
       Queue<TreeNode>q=new LinkedList<>();
       q.offer(root);
       while(!q.isEmpty()){
          int size=q.size();
          for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            ls.add(node.val);
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right!=null){
                q.offer(node.right);
            }
          }
       }
       Collections.sort(ls);
       HashMap<Integer,Integer>hm=new HashMap<>();
       for(int i=0;i<ls.size();i++){
          int key=ls.get(i);
          hm.put(key,hm.getOrDefault(key,0)+1);
       }
       int max=Integer.MIN_VALUE;
       for(int keys:hm.keySet()){
          int val=hm.get(keys);
          if(val>max){
            max=val;
          }
       }
       List<Integer>temp=new ArrayList<>();
       for(int keys:hm.keySet()){
        int val=hm.get(keys);
        if(val==max){
            temp.add(keys);
        }
       }
       int arr[]=new int[temp.size()];
       for(int i=0;i<arr.length;i++){
        arr[i]=temp.get(i);
       }
       return arr;
    }
}
