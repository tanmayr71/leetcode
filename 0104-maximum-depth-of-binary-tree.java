//TC-O(N)
//SC-O(N)
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}

class Solution2 {
    public int maxDepth(TreeNode root) {
        return getDepth(root, 0);
    }

    public int getDepth(TreeNode root, int n) {
        if(root==null){
            return n;
        }
        n++;
        int depth=n;
        if(root.left!=null){
            depth = Math.max(depth, getDepth(root.left, n));
        }
        if(root.right!=null){
            depth = Math.max(depth, getDepth(root.right, n));
        }    
        return depth;
    }
}
