public class BinaryTree {

   Node root;
   int N;

    public static class Node{
       public  Node left;
       public  Node right;
       public int val;
       public Node(int _val, Node left, Node right){
       this.left = left;
       this.right = right;
       this.val = _val;
       }

       public Node(int _val){
         this.val = _val;
       }
    }

    public void add(int val){
          if(N==0){
              root = new Node(val);
          }
          else{
              int level = (int)(Math.log(N)/ Math.log(2));
              while(true){

              }
          }
         }



        //[1,2,3,4,5,6,7]
        //             1
        //           /    \
        //         2       3
        ///       / \      / \
         //      4   5     6  7


}
