package org.naveen.numtowords.config;

import static ong.naveen.numtowords.constants.Constants.*;

import java.util.HashMap;
import java.util.Map;
public class Mappers {
	private Map<Integer, String> onesAndTwos = initOnesAndTwos();
	private Map<Integer, String> tenMultiples = initTenMultiples();
	
	private Map<Integer, String> initOnesAndTwos() {
		Map<Integer, String> ones = new HashMap<>();
		ones.put(0, EMPTY);
		ones.put(1, ONE);
		ones.put(2, TWO);
		ones.put(3, THREE);
		ones.put(4, FOUR);
		ones.put(5, FIVE);
		ones.put(6, SIX);
		ones.put(7, SEVEN);
		ones.put(8, EIGHT);
		ones.put(9, NINE);
		ones.put(10, TEN);
		ones.put(11, ELEVEN);
		ones.put(12, TWELVE);
		ones.put(13, THIRTEEN);
		ones.put(14, FOURTEEN);
		ones.put(15, FIFTEEN);
		ones.put(16, SIXTEEN);
		ones.put(17, SEVENTEEN);
		ones.put(18, EIGHTEEN);
		ones.put(19, NINETEEN);
		return ones;
	}
	private Map<Integer, String> initTenMultiples() {
		Map<Integer, String> tenMultiples = new HashMap<>();
		tenMultiples.put(20, TWENTY);
		tenMultiples.put(30, THIRTY);
		tenMultiples.put(40, FOURTY);
		tenMultiples.put(50, FIFTY);
		tenMultiples.put(60, SIXTY);
		tenMultiples.put(70, SEVENTY);
		tenMultiples.put(80, EIGHTY);
		tenMultiples.put(90, NINETY);
		return tenMultiples;
	}
	
	public Map<Integer, String> below20() {
		return onesAndTwos;
	}
	
	public Map<Integer, String> tenMultiples() {
		return tenMultiples;
	}
}
