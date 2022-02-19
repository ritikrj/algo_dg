
import java.util.ArrayList;
import java.util.List;
public class ParenthesisGenerator {

    public List<String> generateParenthesis(int n) {
        ArrayList<String> array = new ArrayList<String>();
        spawnParen(n,"",array,n);
        return array ;

    }

    public static void spawnParen(int n, String s, ArrayList<String> array,int len ){
        if(!isValid(s,len)){
            return ;
        }
        if(n==0)
            array.add(s);
        spawnParen(n-1, s+'(', array,len);
        spawnParen(n-1, s+')', array,len);
    }


    public static boolean isValid(String s,int len){
        System.out.println(s);
        char open = '(';
        char close = ')';
        int openCount = 0;
        int closeCount = 0;

        if(s.length() > len) return false;

        for(int i = 0; i< s.length() ; i++){
            if(s.charAt(i) == open)
                openCount++;
            else
                closeCount++;
        }

        if(s.length() == len){
            if(openCount > len/2 || closeCount > len/2) return false;
            else
                return true;
        }else{

            if(openCount >= closeCount && openCount <= len/2) return true;
            else return false;
        }

    }




}
