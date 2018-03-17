package practice;

public class IsPalindrome {
  public boolean isPalindrome(int x) {
	  String temp=String.valueOf(x);
	  int i=0;
	  int j=temp.length()-1;
	  while(i<=j) {
		  if(temp.charAt(i)!=temp.charAt(j))
			  return false;
		  i++;
		  j--;
	  }
	  return true;
  }
  public static void main(String[]args) {
	  IsPalindrome l1= new IsPalindrome();
	  System.out.print(l1.isPalindrome(12321));
  }
}
