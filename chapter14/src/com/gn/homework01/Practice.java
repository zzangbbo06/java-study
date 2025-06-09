package com.gn.homework01;

import java.io.FileOutputStream;
import java.io.IOException;

public class Practice {

	public void method1(String song) throws IOException {
		FileOutputStream fos = new FileOutputStream("C:\\test\\sub\\나비야1.dat");
		byte[] songs = song.getBytes();
		fos.write(songs);
	}
	public void method2(String song) throws IOException {
		FileOutputStream fos2 = new FileOutputStream("C:\\test\\sub\\나비야2.dat");
		byte[] songs = song.getBytes();
		fos2.write(songs);
	}
}
