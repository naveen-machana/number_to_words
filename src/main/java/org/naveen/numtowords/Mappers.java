package org.naveen.numtowords;

import java.util.HashMap;
import java.util.Map;

public class Mappers {
	private Map<Integer, String> onesAndTwos = initOnesAndTwos();
	private Map<Integer, String> tenMultiples = initTenMultiples();
	
	private Map<Integer, String> initOnesAndTwos() {
		Map<Integer, String> ones = new HashMap<>();
		ones.put(0, "");
		ones.put(1, "one ");
		ones.put(2, "two ");
		ones.put(3, "three ");
		ones.put(4, "four ");
		ones.put(5, "five ");
		ones.put(6, "six ");
		ones.put(7, "seven ");
		ones.put(8, "eight ");
		ones.put(9, "nine ");
		ones.put(10, "ten ");
		ones.put(11, "eleven ");
		ones.put(12, "twelve ");
		ones.put(13, "thirteen ");
		ones.put(14, "fourteen ");
		ones.put(15, "fifteen ");
		ones.put(16, "sixteen ");
		ones.put(17, "seventeen ");
		ones.put(18, "eighteen ");
		ones.put(19, "nineteen ");
		return ones;
	}
	private Map<Integer, String> initTenMultiples() {
		Map<Integer, String> tenMultiples = new HashMap<>();
		tenMultiples.put(20, "twenty ");
		tenMultiples.put(30, "thirty ");
		tenMultiples.put(40, "fourty ");
		tenMultiples.put(50, "fifty ");
		tenMultiples.put(60, "sixty ");
		tenMultiples.put(70, "seventy ");
		tenMultiples.put(80, "eighty ");
		tenMultiples.put(90, "ninety ");
		return tenMultiples;
	}
	
	public Map<Integer, String> below20() {
		return onesAndTwos;
	}
	
	public Map<Integer, String> tenMultiples() {
		return tenMultiples;
	}
}
