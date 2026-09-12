
import java.util.*;
class Main {
    public static void main(String[] args) {
        int arr1[]={1,1,2,3,4,5};
        int arr2[]={2,3,4,4,5,6};
        ArrayList<Integer>ls=new ArrayList<>();
        int j=0,i=0;
        int n1=arr1.length;
        int n2=arr2.length;
        while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                if(ls.size()==0||ls.get(ls.size()-1)!=arr1[i]){
                    ls.add(arr1[i]);
                }
                i++;
            }
            else{
                if(ls.size()==0||ls.get(ls.size()-1)!=arr2[j]){
                    ls.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<n1){
           if(ls.size()==0||ls.get(ls.size()-1)!=arr1[i]){
                    ls.add(arr1[i]);
                }
                i++; 
        }
        while(j<n2){
             if(ls.size()==0||ls.get(ls.size()-1)!=arr2[j]){
                    ls.add(arr2[j]);
                }
                j++;
        }
        System.out.println(ls);
    }
}
