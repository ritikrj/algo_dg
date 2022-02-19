import jdk.internal.org.objectweb.asm.tree.FieldInsnNode;

import java.util.ArrayList;
import java.util.List;
/*
131. Palindrome Partitioning
Medium

3104

98

Add to List

Share
Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.

 https://leetcode.com/problems/palindrome-partitioning/
 */

public class PallindromePartitioning {
    public List<List<String>> partition(String s) {
        int len = s.length();
        List<List<String>> list =  new ArrayList<List<String>>();


        interate(s, 0,  list, new ArrayList<>());
        return list;
    }
    public static void interate(String s, int start, List<List<String>> list, List<String> inner){
        int interval = 1;
        if(s.isEmpty()){
            list.add(inner);
            System.out.println(inner);
            return;
        }
        //System.out.println(s+"interval <= s.length()"+ (interval <= s.length()));
        while(interval <= s.length() ){
            ArrayList<String> innercopy = new ArrayList<String>();
            // System.out.println(s.substring(start,start+ interval)+" "+isPalindrome(s.substring(start,start+ interval)));
            if(isPalindrome(s.substring(0,interval))){
                innercopy.addAll(inner);
                innercopy.add(s.substring(0,start+ interval));
                interate(s.substring(interval),0, list, innercopy );
            }
            interval++;
        }
    }
    public static boolean isPalindrome(String s){
       // System.out.println("isPlaindrome->"+s);
        if(s.length() == 1) return true;
        int end = s.length() -1;
        int start = 0;

        while(start<end){
            if(s.charAt(start)!= s.charAt(end)) return false;
            start++;
            end--;

        }
        return true;

    }
}