class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
       if(students.length==0&&sandwiches.length==0){
        return 0;
       }
       Queue<Integer>q1=new LinkedList<>();
       Queue<Integer>q2=new LinkedList<>();
       for(int i=0;i<students.length;i++){
          q1.offer(students[i]);
       }
       for(int i=0;i<sandwiches.length;i++){
         q2.offer(sandwiches[i]);
       }
       int i=0;
       while(!q1.isEmpty()&&!q2.isEmpty()){
         if(q1.peek().equals(q2.peek())){
            q1.poll();
            q2.poll();
            i=0;
         }
         else{
            int key=q1.poll();
            q1.offer(key);
            i++;
         }
         if(i==q1.size()&&i!=0){
            return q1.size();
         }
       }
       return 0;
    }
}
