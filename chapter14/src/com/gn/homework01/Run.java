package com.gn.homework01;

import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		String song = "나비야, 나비야 이리 날아오너라"
				+ "\n노랑나비, 흰 나비 춤을 추며 오너라"
				+"\n봄바람에 꽃잎도 방긋방긋 웃으며"
				+ "\n참새도 짹짹짹 노래하며 춤춘다";
		
		
		Practice practice = new Practice();
		
		long startTime = System.nanoTime();
		practice.method1(song);
		
		practice.method2(song);
		
	}
}
