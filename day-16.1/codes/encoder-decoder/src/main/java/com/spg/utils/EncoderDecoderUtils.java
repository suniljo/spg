package com.spg.utils;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncoderDecoderUtils {

	public String encodeData(String data) {
		Encoder encoder = Base64.getEncoder();
		byte[] b = data.getBytes();
		String encodedData = encoder.encodeToString(b);
		return encodedData;
	}
	
	public String decodeData(String data) {
		Decoder decoder = Base64.getDecoder();
		byte[] b =decoder.decode(data.getBytes());
		String decodedData = new String(b);
		return decodedData;
	}
}
