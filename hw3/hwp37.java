package hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hwp37 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("�п�J�@�ӭ^��r��");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String stru=str.toUpperCase();
		String strr=str.toLowerCase();
		System.out.println("�ഫ���j�g�ɬ�"+stru);
		System.out.println("�ഫ���p�g�ɬ�"+strr);
	}

}
