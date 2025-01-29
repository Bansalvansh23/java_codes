package Hashing;
import java.util.*;
public class ValidAnagram {
    public static boolean IsAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),map.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            if(map.get(s2.charAt(i)) != null){
                if(map.get(s2.charAt(i))==1){
                    map.remove(s2.charAt(i));
                }
                else{
                    map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void  main(String[] args){
        String s1 = "race";
        String s2 = "care";
        System.out.println(IsAnagram(s1, s2));
    }
}
