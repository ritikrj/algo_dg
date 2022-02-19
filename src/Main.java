import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args)
    { // Print N random values in (lo, hi).
//        int N = Integer.parseInt(args[0]);
//        double lo = Double.parseDouble(args[1]);
//        double hi = Double.parseDouble(args[2]);
//        for (int i = 0; i < N; i++)
//        {
//            double x = StdRandom.uniform(lo, hi);
//            StdOut.printf("%.2f\n", x);
//        }
          char[][] arr = new char[3][4];
          arr[0] = new char[] {'1','0','1','0'};
          arr[1] = new char[] {'1','1','1','1'};
          arr[2] = new char[] {'1','0','1','1'};
//        List<int[]> list = new ArrayList<>();
//        Permutator.permute(0,arr,list);
//        System.out.println("sucedd");
//        BinaryTree.Node temp = new BinaryTree.Node(9);
//        BinaryTree.Node temp1 = new BinaryTree.Node(8, null, temp);
//        temp1.left = new  BinaryTree.Node(7);
//        temp.right = new  BinaryTree.Node(3);
//        temp.left = new  BinaryTree.Node(5);
//        temp.left.left = new  BinaryTree.Node(1);
//        traverse(temp1);
        //new PallindromePartitioning().partition("aabaa");

         //System.out.println(new ParenthesisGenerator().generateParenthesis(6));
       // Li =  new ParenthesisGenerator().generateParenthesis(6);
        //System.out.println(filter("catsanddogs","cats"))

//        while(true)
//        System.out.println(new MaximalSquares().maximalSquare(arr));
//[["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
        char[][] matrix = new char[4][5];
        matrix[0] = new char[]{'1','0','1','0','0'};
        matrix[1] = new char[]{'1','0','1','1','1'};
        matrix[2] = new char[]{'1','1','1','1','1'};
        matrix[3] = new char[]{'1','0','0','1','0'};
        System.out.println(compareWithout("gein","deen"));


    }

    public static String filter(String s, String filter){
        int i = 0;
        while(i < s.length() - filter.length() + 1){
            if(s.substring(i,i+filter.length()).compareTo(filter)  == 0)
            {

                s = s.substring(0,i)+s.substring(i+filter.length());
              //  System.out.println(s);
                if(s.length() >  filter.length() && i >= filter.length())
                i = i - filter.length()  ;
                //System.out.println(s);
                continue;
            }
            i++;
        }
        return s;
    }

    public static String compareWithout( String beginWord, String listWord ){
        for(int indx =0; indx < beginWord.length();indx++){
            if((beginWord.substring(0,indx) + beginWord.substring(indx+1)).compareTo((listWord.substring(0,indx) + listWord.substring(indx+1))) == 0){
                return listWord;
            }
        }
        return "";

    }

    public static void traverse(BinaryTree.Node root){
        Queue<BinaryTree.Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (true){
            Queue<BinaryTree.Node> level = new ArrayDeque<>();
            while (!queue.isEmpty()){
            BinaryTree.Node curr = queue.peek();
            System.out.print(curr.val);
           if(curr.left!=null)
            level.add(curr.left);

            if(curr.right!=null)
            level.add(curr.right);

             queue.poll();
            }
            System.out.println("----");
            queue = level;
            if(queue.isEmpty()) break;
        }

    }


    public static int getRev(int val){
        int rev =0;

        while(val!=0){
            rev = rev*10 + val%10;
            val = val/10;
        }
     return rev;
    }

}
