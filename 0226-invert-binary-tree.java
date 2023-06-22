class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
        }

        TreeNode temp = invertTree(root.right);
        root.right = invertTree(root.left);
        root.left = temp;
        
        return root;
    }
}
