/*
	Introduction
 	=> FileInputStream 과 FileOutStream 을 사용하기
 	1. system.in으로 글 입력받기 
 	2. FileOutStream으로 입력받은 글 파일로 만들기
 		Condition
 		// 파일은 이미 존재하는 파일에 입력되는 것으로 미리 만들어 놓을 것.
 		// cmd에서 ctrl+c 값으로 프로그램 종료하도록 한다.
 */

package io;

import java.io.*;

public class Ex_4FileStream {

	public static void main(String[] args) {
		
		int output = 0;
		int input = 0;
		
		String saveFile = "C:/Users/ilpyo/Desktop/자바테스트.txt";

			try {
				FileOutputStream outputS = new FileOutputStream(saveFile, true);
				BufferedOutputStream bufferO = new BufferedOutputStream(outputS, 1024);
				
				while ((output=System.in.read())!=-1) {
					bufferO.write(output);
					bufferO.flush();						
				}
			outputS.close();
			System.in.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
			System.out.println(saveFile+"을 생성했습니다!");
			}

}

