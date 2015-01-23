/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:

 *  A -> 1
 *  B -> 2
 *  C -> 3
 *  ...
 *  Z -> 26
 *  AA -> 27
 *  AB -> 28 
 */

package ylyan.leetcode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int num = 0;
		char[] ca;
		s = s.toUpperCase();
		ca = s.toCharArray();
		
		for(int i=0;i<ca.length;i++){
			System.out.println(Character.getNumericValue(ca[i])-9);
		}
		return num;
	}
}
