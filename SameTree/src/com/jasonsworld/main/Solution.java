package com.jasonsworld.main;

/**
 * Created by yongsheng on 2014/10/25.
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p != null && q == null){
            return false;
        }else if(p == null && q != null){
            return false;
        }else{
            if(p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right) ){
                return true;
            }
        }
        return false;
    }
}
