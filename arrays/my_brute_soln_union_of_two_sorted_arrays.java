import java.util.*;
class Main {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        ArrayList<Integer>ls=new ArrayList<>();
        int arr1[]={1,1,2,3,4,5,7};
        int arr2[]={2,3,4,4,5,6};
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            hs.add(arr2[i]);
        }
        int ans[]=new int[hs.size()];
        int j=0;
        for(int nums:hs){
            ans[j]=nums;
            j++;
        }
        Arrays.sort(ans);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
