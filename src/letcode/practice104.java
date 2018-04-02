package letcode;

public class practice104 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int lf = maxDepth(root.left);
            int rf = maxDepth(root.right);
            if(lf > rf){
                return lf + 1;
            }else{
                return rf + 1;
            }
        }
    }
}
