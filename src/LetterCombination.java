import java.util.*;
public class LetterCombination {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        if(!digits.isEmpty())
            iterate("",digits, map, list);
        return list;
    }

    static void iterate(String build, String digits, HashMap<Character, String> map,List<String> list ){
        if(digits.isEmpty()){
            list.add(build);
            return;
        }
        Character c = digits.charAt(0);
        String keys = map.get(c);
        while(!keys.isEmpty()){
            iterate(build+ keys.charAt(0), digits.substring(1), map, list);
            keys = keys.substring(1);
        }
    }

    /* // better approach !!80% 80%
     public List<String> letterCombinations(String digits) {

		// base case
        List<String> out = new ArrayList<>();
        if (digits.isEmpty())
            return out;
        String[] strings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		// for each string in the out list, we need to add all the characters of the current number
		// to the end

		// initially we simply add an empty string
		// so that for the first number, all the characters will be added to the end of the empty string
        out.add("");

		// for each character(number) in the "digits" variable
        for (char ch : digits.toCharArray()) {

			// create a new list to store the results of the current iteration
            List<String> temp = new ArrayList<>();

			// for every string present in the list already
            for (String str : out) {

				// we get the characters associated with the current digit
                String letters = strings[Integer.parseInt(String.valueOf(ch))];

				// and add each letter to the end of all the strings currently present in the list
                for (char letter : letters.toCharArray()) {
                    temp.add(str + String.valueOf(letter));
                }
            }

			// then just have "out" point to the current temp list and repeat the process for each digit
            out = temp;
        }
        return out;
    }
     */
}
