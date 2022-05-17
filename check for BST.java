
public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        // code here.
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        boolean x= BST(root,min,max);
        return x;
    }
        private static boolean BST(Node root,int min,int max)
        {
            if(root==null)
            {
                return true;
            }
            return root.data>min && root.data<max&& isBSt(root.left,min,root.data) && isBST(root.right,root.data,max);
            
  }
