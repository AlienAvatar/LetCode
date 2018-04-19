package letcode;

/**
 * 输入: 二叉搜索树:
      5
     / \
    2  13

 输出: 转换为累加树:
     18
    /  \
   20  13

 */
public class Practice538 {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val = x;
        }
    }

    public int sum = 0;
    public TreeNode convertBST(TreeNode root) {
          if(root == null){
              return null;
          }
          if(root.right != null){
              convertBST(root.right);
          }
          sum = sum + root.val;
          root.val = sum;
          if(root.left != null){
              convertBST(root.left);
          }
          return root;
    }

    public static void main(String[] args) {
        test(1);
    }

    public static int test(int i){
        i++;
        if(i==30){
            System.out.println(i);
            return i;
        }
        int k = test(i);
        return k;
    }
}
