package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
//  public List<String> letterCombinations(String digits) {
//        Map<Character,char[]> NumberToChar=new HashMap<Character,char[]>();
//        List<String> result=new ArrayList<String>();
//        NumberToChar.put('2',"abc".toCharArray());
//        NumberToChar.put('3', "def".toCharArray());
//        NumberToChar.put('4', "ghi".toCharArray());
//        NumberToChar.put('5', "jkl".toCharArray());
//        NumberToChar.put('6', "mno".toCharArray());
//        NumberToChar.put('7', "pqrs".toCharArray());
//        NumberToChar.put('8', "tuv".toCharArray());
//        NumberToChar.put('9', "wxyz".toCharArray());
//        int index=0;
//        int size=0;
//        char [] numbers=new char[digits.length()];
//        while(index<digits.length()){
//        	if(digits.charAt(index)!=0 && digits.charAt(index)!=1) {
//        		numbers[size]=digits.charAt(index);
//        		size++;
//        	}
//        	index++;
//        }
//        if(size==1) {
//        	for(char i:NumberToChar.get(numbers[0]))
//        		result.add(Character.toString(i));
//        	return result;
//        }
//        int times=1;
//        while(times<4) {
//        	
//        	while(numbers[])
//        }
//        
//    }
	public List<String> letterCombinations(String digits){
		
		LinkedList<String> ans=new LinkedList<String>();
		if(digits.length()==0) return ans;
		String[] mapping=new String[] {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		ans.add("");
		for(int i=0;i<digits.length();i++) {
			int x=Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i) {
				String t=ans.remove();
				for(char s:mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	}
   public static void main(String[] args) {
	     LetterCombinationsOfPhoneNumber l1=new LetterCombinationsOfPhoneNumber();
	     System.out.print(l1.letterCombinations("0101"));
   }
}
