/*
	Introduction
 	=> FileInputStream 과 FileOutStream 을 사용하기 
 	1. FileInStream으로 글 파일 불러오기
 	2. system.out으로 모니터에 출력하기 
 		Condition
 		// 파일은 이미 존재하는 파일에 입력되는 것으로 미리 만들어 놓을 것.
 		// cmd에서 ctrl+c 값으로 프로그램 종료하도록 한다.
 */

package io;

import java.io.*;

public class Ex_3FileStream2 {

	public static void main(String[] args) {
		
		int output = 0;
		int input = 0;
		
		String saveFile = "C:/Users/ilpyo/Desktop/자바테스트.txt";
		byte[] byteArr = new byte[512];

			
			
			try {
				FileInputStream inputS = new FileInputStream(saveFile);
				while((input=inputS.read())!=-1) {
					System.out.write(input);
					System.out.flush();
				}
				System.out.close();
				inputS.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		
	}

}

