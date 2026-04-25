
public class MaximumSubArray {
    public int subArray(int[] num)
    {
        int cur_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i =0;i<num.length;i++)
        {
            int temp = cur_sum + num[i];
            if(temp<num[i])
            {
                cur_sum = num[i];
            }
            else
            {
                cur_sum = temp;
            }
            //...........
            if (cur_sum > max_sum)
            {
                max_sum = cur_sum;   
            }
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int[] num = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubArray obj = new MaximumSubArray();
        int result = obj.subArray(num);
        System.out.println("Maximum sum = "+result);
    }
    
}
