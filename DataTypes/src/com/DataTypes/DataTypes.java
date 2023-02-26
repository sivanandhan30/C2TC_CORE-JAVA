package com.DataTypes;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Byte - 1 Byte
		byte ByteMax = 127;
		byte ByteMin = -128;
		
		System.out.println(ByteMax);
		System.out.println(ByteMin);
		
		//Short - 2 Byte
		short ShortMax = 32767;
		short ShortMin = -32768;
		
		System.out.println(ShortMax);
		System.out.println(ShortMin);
		
		//Integer - 4 Bytes
		int intMax = 14556335;
		int intMin = -14454555;
		
		System.out.println(intMax);
		System.out.println(intMin);
		
		float fl = 6.89056734252783456f;//Size: 4 bytes, Stores fractional numbers, of 6 to 7 decimal digits
		System.out.println(fl);
		
		double db = 6.89056734252783456;//Size: 8 bytes, Stores fractional numbers, of 15 decimal digits
		System.out.println(db);
		
		char ch1 = 'a';//Size: 2 bytes, Can store a character(Upper case/Lower case) or their ASCII Values
		char ch2 = 65; //Returns the ASCII Character(Value) for the integer '65'
		System.out.println(ch1+ "," +ch2);
		
		String text = "Hello Everyone"; 
		System.out.println(text);
	
		
		//Boolean - 1 Byte
		boolean flag1 = true;
		boolean flag2 = false;
		
		System.out.println(flag1);
		System.out.println(flag2);
		
		
	}

}
