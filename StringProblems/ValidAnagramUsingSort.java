import java.util.Arrays;
public class ValidAnagramUsingSort {
     public boolean anagram(String s, String t)
    {
        if(s.length()!= t.length()) return false;

        char [] a = s.toCharArray();
        char [] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a,b);

    
    }
        public static void main(String[] args)
        {
        String s = "accdeeeg";
        String t = "adecceef";
        ValidAnagramUsingSort obj = new ValidAnagramUsingSort();
        System.out.println(obj.anagram(s, t));
    }
    
}

