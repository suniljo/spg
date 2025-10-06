package com.spg;

import com.spg.utils.EncoderDecoderUtils;

public class App {

	public static void main(String[] args) {
		EncoderDecoderUtils utils = new EncoderDecoderUtils();
		
		String data = "some data";
		String encryptedData = utils.encodeData(data);
		System.out.println(encryptedData);
		
		String decryptedData = utils.decodeData(encryptedData);
		System.out.println(decryptedData);
	}

}
