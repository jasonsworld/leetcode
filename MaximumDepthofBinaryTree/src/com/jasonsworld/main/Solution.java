package com.jasonsworld.main;

/**
 * Created by yongsheng on 2014/10/25.
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        int leftDepth = 0, rightDepth = 0;
        if(root == null) {
            return 0;
        }
        leftDepth = maxDepth(root.left);
        rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth+1 : rightDepth+1;
    }
}
