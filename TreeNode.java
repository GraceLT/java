package practice;

public class TreeNode {
   TreeNode LefChild;
   TreeNode RightChild;
   int nMaxLeft=0;
   int nMaxRight=0;
   int value;
   public TreeNode(TreeNode LeftChild,TreeNode RightChild,int value) {
	   this.LefChild=LeftChild;
	   this.RightChild=RightChild;
	   this.value=value;
   }
}
