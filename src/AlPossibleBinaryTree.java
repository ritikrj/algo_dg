import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlPossibleBinaryTree {

    public static void main(String[] args) {
        new AlPossibleBinaryTree().allPossibleFBT(7);
}

          public class TreeNode {
            int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}

          TreeNode(int val) { this.val = val; }

          TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
                this.right = right;
         }
         }
         //*/

         static HashMap<Integer, List<TreeNode>> dp ;
    public List<TreeNode> allPossibleFBT(int n){
        dp = new HashMap();

        return allPossibleFBTD(n);
    }
    public List<TreeNode> allPossibleFBTD(int n) {
        if(dp.containsKey(n)){
            System.out.println("dping ");
            return dp.get(n);
        }
        // System.out.println(n + " n "+ dp.containsKey(n));
        // System.out.println("dp ==>> "+dp);

        if(n == 3){
            TreeNode tri = new TreeNode(0, new TreeNode(0), new TreeNode(0));
            List<TreeNode> triList = new ArrayList();
            triList.add(tri);
            dp.put(n ,  triList);
            return triList;
        }
        if(n == 1){
            List<TreeNode> triList = new ArrayList();
            triList.add(new TreeNode(0));
            dp.put(n ,  triList);
            return triList;
        }

        List<TreeNode> allPossibleLeft  = new ArrayList();
        List<TreeNode> allPossibleRight = new ArrayList();

        n = n-1;
        List<TreeNode> levelList =  new ArrayList();

        for(int i = 1 ; i <= n; i++){
            if((n-i) % 2 == 0 || i% 2 == 0) continue;

            allPossibleLeft = allPossibleFBT(n-i);
            allPossibleRight = allPossibleFBT(i);
            for(TreeNode L : allPossibleLeft){
                for(TreeNode R: allPossibleRight){
                    levelList.add(new TreeNode(0,  L,  R ));
                }
            }
        }
        //  System.out.println("dping "+dp);

        dp.put(n+1 , levelList);
        // System.out.println(n + " n "+ dp.containsKey(n));
        // System.out.println("dp - "+dp);
        return levelList;

    }

//        public List<TreeNode> allPossibleFBT(int n) {
//            if(n == 3){
//                TreeNode tri = new TreeNode(0, new TreeNode(0), new TreeNode(0));
//                List<TreeNode> triList = new ArrayList();
//                triList.add(tri);
//                return triList;
//            }
//            if(n == 1){
//                List<TreeNode> triList = new ArrayList();
//                triList.add(new TreeNode(0));
//                return triList;
//            }
//
//            List<TreeNode> allPossibleLeft  = new ArrayList();
//            List<TreeNode> allPossibleRight = new ArrayList();
//
//            n = n-1;
//            List<TreeNode> levelList =  new ArrayList();
//            for(int i = 1 ; i <= n; i++){
//                if((n-i) % 2 == 0 || i% 2 == 0) continue;
//
//                System.out.println("left =" + i + "right="+ (n-i));
//
//                allPossibleLeft = allPossibleFBT(i);
//                allPossibleRight = allPossibleFBT(n-i);
//                for(TreeNode L : allPossibleLeft){
//                    for(TreeNode R: allPossibleRight){
//                        levelList.add(new TreeNode(0,  L,  R ));
//                    }
//                }
//               // System.out.println("left =" + i + "rigth =" + (n-i) + " size = " + allPossibleLeft.size() );
//            }
//
//          //  List<TreeNode> levelList =  new ArrayList();
//
////            for(int i = 0; i <  allPossibleRight.size(); i++  ){
////
////                levelList.add(new TreeNode(0,  allPossibleLeft.get(i),  allPossibleRight.get(i)) );
////
////            }
//
//            return levelList;
//
//        }

}
