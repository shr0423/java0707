package org.sp.app0707.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * IT분야에서 입력도구는 다양하지만 그중 표준입력도구인 키보드로부터
 * 데이터를 읽어보자
 * 주의) FileInputStream:파일을 대상으로한 입력스트림
 * 		KeyboardInputStream(X)-->InputStream 으로 처리해야함
 * 왜? 내일이라도 당장 어떤 디바이스가 나올지 알수없다
 * */
public class KeyboardTest {
	
	
	public static void main(String[] args) {
		//디바이스 , 파일 등 다양한 매체로부터 입력을받기위한 입력스트림 객체
		//를 사용해야 하고 이 클래스는 추상클래스로 지원된다 따라서new불가
		InputStream is=System.in;
		
		//한글이 깨지지 않기위해 Reader를 이용하자
		InputStreamReader reader=null;
		reader=new InputStreamReader(is);
		
		BufferedReader buffr=null;
		buffr=new BufferedReader(reader);
		
		try {
			//int data=-1;
			String msg=null;
			//read()메서드는 데이터를 읽을때까지 대기상태에 빠짐
			while(true) {
			msg=buffr.readLine();
			// System.out.println("읽었어");
			 System.out.print(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		//이미 os가 얻어다놓은 출력스트림을 이용하여 모니터에 출력하는
		//메서드
		//System.out.println();
		
	}
	
}
