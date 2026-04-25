import java.util.HashMap;
public class TwoSum{

    public int[] twosum (int[] num , int target)                //[1,2,7,10] 9
    {
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i<num.length ; i++)
        {
            int need = target - num[i];
            if(map.containsKey(need))
            {
                return new int[] {map.get(need),i};
            }
            else{
                map.put(num[i],i);
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String [] args)
    {

        TwoSum obj = new TwoSum();
        int[] num = {1,2,3,7,10};
        int target = 9;
        int[] result = obj.twosum(num, target);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
}