class Solution
   {
         public Node deleteNode(Node root,int k)
         {
         if (root == null) 
         {
             return null;
         }
            root.left = deleteNode(root.left, k);
            root.right = deleteNode(root.right, k);
            
            if (root.data >= k) 
            {
                root = root.left;
            }
            else if (root.right != null && root.right.data >= k)
            {
                root.right = null;
            }
            
            return root;
         }
   }
