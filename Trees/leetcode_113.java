class Solution {
    static List<List<Integer>>ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer>ls=new ArrayList<>();
        ans.clear();
        dfs(root,targetSum,0,ls);
        return ans;
    }
    public static void dfs(TreeNode root,int targetSum,int sum,List<Integer>ls){
       
        if(root==null){
            return;
        }
        ls.add(root.val);
        sum+=root.val;
        if(root.left==null&&root.right==null){
           if(sum==targetSum){
             ans.add(new ArrayList<>(ls));
           }
          
        }
        dfs(root.left,targetSum,sum,ls);
        dfs(root.right,targetSum,sum,ls);
        ls.remove(ls.size()-1);

    }
}
