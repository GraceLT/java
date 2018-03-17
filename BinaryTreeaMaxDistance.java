package practice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeaMaxDistance {
    public static int maxlen=0;
     void FindMaxLen(TreeNode root) {
    	//根节点为空
    	if(root==null) {
    		return;
    	}
    	//根节点的左子树为空
    	if(root.LefChild==null) {
    		root.nMaxLeft=0;
    	}
    	if(root.RightChild==null) {
    		root.nMaxRight=0;
    	}
    	if(root.LefChild!=null) {
    		FindMaxLen(root.LefChild);
    	}
    	if(root.RightChild!=null) {
    		FindMaxLen(root.RightChild);
    	}

    	if(root.LefChild!=null) {
    		int nTempMax=0;
    		if(root.LefChild.nMaxLeft>root.LefChild.nMaxRight) {
    			nTempMax=root.LefChild.nMaxLeft;
    		}
    		else {
    			nTempMax=root.LefChild.nMaxRight;
    		}
    		root.nMaxLeft=nTempMax+1;
    	}
    	if(root.RightChild!=null) {
    		int nTempMax=0;
    		if(root.RightChild.nMaxLeft>root.RightChild.nMaxRight) {
    			nTempMax=root.RightChild.nMaxLeft;
    		}
    		else {
    			nTempMax=root.RightChild.nMaxRight;
    		}
    		root.nMaxRight=nTempMax+1;
    	}
    	 if(root.nMaxLeft+root.nMaxRight > maxlen)
         {
                   maxlen=root.nMaxLeft+root.nMaxRight;
         } 

    }
    public static void main(String [] args) {
    	TreeNode leaf1=new TreeNode(null,null,4);
    	TreeNode leaf2=new TreeNode(null,null,5);
    	TreeNode leaf3=new TreeNode(null,null,3);
    	TreeNode parent1=new TreeNode(leaf1,leaf2,2);
    	TreeNode root=new TreeNode(parent1,leaf3,1);
    	//FindMaxLen(root);
    	//System.out.print(maxlen);
        List<String> l1=new ArrayList<String>();
        l1.add("1");
        l1.add("2");
        l1.add("3");
        List<String> l2=l1;
        l2=null;
        BinaryTreeaMaxDistance b1=new BinaryTreeaMaxDistance();
        b1.maxlen=1;
        BinaryTreeaMaxDistance b2=new BinaryTreeaMaxDistance();
        b2.maxlen=b2.maxlen+1;
    }
}
