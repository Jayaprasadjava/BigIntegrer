package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class BigIntegerLibrary {

	public static void main(String[] args) {
		BigIntegerLibrary bil = new BigIntegerLibrary();
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("testcase.txt"));
			try {
				String readLine = br.readLine();
				while (readLine != null) {
					String[] split = readLine.split(" ");
				System.out.println(bil.bigIntegerOperation(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2])));
				readLine = br.readLine();
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
	     	e.printStackTrace();
		}
	}
	
	public BigInteger bigIntegerOperation(String operator,int operand1,int operand2) {
		
		if(operator.equalsIgnoreCase("ADD")) {
			int sum = operand1 + operand2;
			return new BigInteger(Integer.toString(sum));
		}else {
			int sub = operand1 - operand2;
			return new BigInteger(Integer.toString(sub));
		}	
	}
}
