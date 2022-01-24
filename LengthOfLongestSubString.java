import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LengthOfLongestSubString {
    public static void lengthOfLongestSubstring(String str){
        String longestSubString = "";
        int longestSubStringLength = 0;
        Map< Character,Integer> map=new HashMap<Character,Integer>();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch = arr[i];
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }
            else{
                i=map.get(ch);
                map.clear();  //clear entries in map.
            }

            if(map.size() >longestSubStringLength){
                longestSubStringLength= map.size();
                longestSubString= map.keySet().toString();   //keyset() is used to get all keys

            }
        }

        System.out.println("Longest substring: "+longestSubString);
        System.out.println("Longest substring length: "+longestSubStringLength);
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=sc.next();
        lengthOfLongestSubstring(str);
    }
}
