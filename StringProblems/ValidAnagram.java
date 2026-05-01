import java.util.HashMap;

public class ValidAnagram 
{

    public boolean anagram (String s , String t)
    {
       if (s.length()!=t.length()) return false;
       HashMap <Character,Integer> map=new HashMap<>();
       for (int i =0 ; i<s.length();i++)
       {
        char c = s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
       }
       for(int i =0 ; i<t.length();i++)
       {
        char c = t.charAt(i);
        if (map.containsKey(c)) 
        {
            map.put(c,map.getOrDefault(c,0)-1);   
            if (map.get(c)==0)
            {
                map.remove(c);
            }
        }
        else
        {
            return false;
        }
       }
       return map.isEmpty();

    }
    public static void main(String[] args) {
        String s = "aab$bcc*";
        String t = "abcabc$*";
        ValidAnagram obj = new ValidAnagram();
        System.out.println(obj.anagram(s, t));
    }
    
}
