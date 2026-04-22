package jp.co.aforce.sample;

public class SplitNumber {
	public static void main(String[]args) {
		
		double num = 7.8;
		
		int integerPart = (int) num;
		double decimalPart = num - integerPart;
		
		System.out.println("少数部分:" + integerPart);
		System.out.println("小数部分:" + decimalPart);
		
	}

}
