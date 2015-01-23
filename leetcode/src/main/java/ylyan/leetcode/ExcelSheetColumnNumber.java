/**
 * 171 Excel Sheet Column Number
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
	// Runtime: 218 ms
	// Faster than most solutions.
	public int titleToNumber(String s) {
		int num = 0;
		char[] ca;
		s = s.toUpperCase();
		ca = s.toCharArray();
		
		int len = ca.length;
		for(int i=0;i<len;i++){
			num += (Character.getNumericValue(ca[i])-9) * Math.pow(26, len-1-i);
		}
		return num;
	}
}
