package com.spg.services;

public class LargestService {

	public int findLargest(int[] data) {
		//int lar = 0;
		int lar = data[0];
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] > lar) {
				lar = data[i];
			}
		} // for
		return lar;
	}

}
