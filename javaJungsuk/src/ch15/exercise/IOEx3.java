package ch15.exercise;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];	
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		
		try {
			while(input.available() > 0) {
//				input.read(temp);
//				output.write(temp);
				
				int len = input.read(temp);		// 읽어 온 데이터 개수 반환.
				output.write(temp, 0, len);		// 읽어온 개수만큼만 write.
				System.out.println("temp :" + Arrays.toString(temp));
				
				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch (IOException e) {e.printStackTrace();}
		
	}

	private static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          :" + Arrays.toString(temp));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
