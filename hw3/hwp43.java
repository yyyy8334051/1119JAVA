package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp43 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J��Ӿ��");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		String str2=br.readLine();
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		int ans=Math.max(num1,num2);
		System.out.println(num1+"�P"+num2+"�����j���O"+ans);
	}

}
