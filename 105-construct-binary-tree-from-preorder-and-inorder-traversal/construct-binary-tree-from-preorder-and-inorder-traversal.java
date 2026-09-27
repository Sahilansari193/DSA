class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if (preorder.length == 0) {
            return null;
        }

        int rootValue = preorder[0];

        TreeNode root = new TreeNode(rootValue);

        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == rootValue) {
                index = i;
                break;
            }
        }

        int[] leftInorder = new int[index];
        int[] rightInorder = new int[inorder.length - index - 1];

        for (int i = 0; i < index; i++) {
            leftInorder[i] = inorder[i];
        }

        for (int i = index + 1; i < inorder.length; i++) {
            rightInorder[i - index - 1] = inorder[i];
        }

        int[] leftPreorder = new int[index];
        int[] rightPreorder = new int[preorder.length - index - 1];

        for (int i = 1; i <= index; i++) {
            leftPreorder[i - 1] = preorder[i];
        }

        for (int i = index + 1; i < preorder.length; i++) {
            rightPreorder[i - index - 1] = preorder[i];
        }

        root.left = buildTree(leftPreorder, leftInorder);
        root.right = buildTree(rightPreorder, rightInorder);

        return root;
    }
}