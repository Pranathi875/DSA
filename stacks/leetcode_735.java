class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<nums.length;i++){
            boolean alive=true;
            while(!st.isEmpty()&&st.peek()>0&&nums[i]<0){
                if(st.peek()<Math.abs(nums[i])){
                    st.pop();
                }
                else if(st.peek()==Math.abs(nums[i])){
                    st.pop();
                    alive=false;
                    break;
                }
                else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                st.push(nums[i]);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}
