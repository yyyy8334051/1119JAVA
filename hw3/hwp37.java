package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp37 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個英文字母");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String stru=str.toUpperCase();
		String strr=str.toLowerCase();
		System.out.println("轉換成大寫時為"+stru);
		System.out.println("轉換成小寫時為"+strr);
	}

}
