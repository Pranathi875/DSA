import java.util.*;
class Cricketer{
    String name;
    int runs;
    String nickName;
    Cricketer(String name,int runs,String nickName){
        this.name=name;
        this.runs=runs;
        this.nickName=nickName;
    }
    
}

class Main {
    public static void main(String args[]) {
       String name[]={"Virat","Dhoni","Gill","Dube"};
       int []runs={0,100,45,10};
       String nickName[]={"Boom","Bam","Vin","Vum"};
         Stack<Cricketer>st=new Stack<>();
       for(int i=0;i<4;i++){
       Cricketer c=new Cricketer(name[i],runs[i],nickName[i]);
             st.push(c);
       }
       Cricketer temp1=st.pop();
       System.out.println(temp1.name+" "+temp1.nickName+" "+temp1.runs);
       
       Cricketer temp2=st.pop();
       System.out.println(temp2.name+" "+temp2.nickName+" "+temp2.runs);
       
       Cricketer temp3=st.pop();
       System.out.println(temp3.name+" "+temp3.nickName+" "+temp3.runs);
       
       Cricketer temp4=st.pop();
       System.out.println(temp4.name+" "+temp4.nickName+" "+temp4.runs);
  
       
       
    }
}
