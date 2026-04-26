public class MoveZeros {
    public void movezero(int[]num)
    {
        int indexPointer = 0;
        for(int i =0;i<num.length;i++)
        {
            if(num[i]!=0)
            {
                num[indexPointer] = num[i];
                indexPointer++;
            }
        }
        while (indexPointer<num.length) 
        {
            num[indexPointer]=0;
            indexPointer++;
        }
    }
    public static void main(String[] args) {
        int[] num = {0,1,0,3,12};
        MoveZeros obj = new MoveZeros();
        obj.movezero(num);
        for (int item : num)
         {
            System.out.print(item+" ");
            
        }
    }
    
}
