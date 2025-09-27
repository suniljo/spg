package com.spg.java.utils;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class CountWords {

	public static void main(String[] args) {
		String article = "hello Hello HEllo hi hi hi! Welcome     welcome wordl   earth";
		article = article.toLowerCase();
		
		String[] words = article.split("[! ;*&]+");
		System.out.println("no of words = " + words.length);
		System.out.println(Arrays.toString(words));
		System.out.println();
		
		Map<String, Integer> wordCountsMap = new TreeMap<String, Integer>();
		for(String word : words) {
			if(wordCountsMap.containsKey(word)) {
				int count = wordCountsMap.get(word);
				count++;
				wordCountsMap.put(word, count);
			}else {
				wordCountsMap.put(word, 1);
			}
		}
		
		System.out.println(wordCountsMap);
	}

}
