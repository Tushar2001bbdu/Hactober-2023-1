import java.util.*;
public class Subset_Array 
{
    public static void main(String args[])
    {
        int[] arr={1,2,2};
        List<List<Integer>> answer=Subset_Array.sub(arr);

        for(List<Integer> ar:answer)
        {
            System.out.println(ar);
        }
    }
    public static List<List<Integer>> sub(int[] arr)
    {
        ArrayList<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=0;
            if((i>0)&&(arr[i]==arr[i-1]))
            {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=start;j<n;j++){
            ArrayList<Integer> internal=new ArrayList<>(outer.get(j));
            internal.add(arr[i]);
            outer.add(internal);}
            

        }
        return outer;
    }
}
