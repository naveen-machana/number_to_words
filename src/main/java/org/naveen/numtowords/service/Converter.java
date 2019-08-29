package org.naveen.numtowords.service;

import static ong.naveen.numtowords.constants.Constants.AND;
import static ong.naveen.numtowords.constants.Constants.EMPTY;
import static ong.naveen.numtowords.constants.Constants.HUNDRED;

import java.util.Optional;

import org.naveen.numtowords.config.Mappers;

public class Converter {
	private int divisor;
	private String suffix;

	
	private Mappers mappers;
	
	public Converter(String suffix, int divisor, Mappers mappers) {
		this.divisor = divisor;
		this.suffix = suffix;
		this.mappers = mappers;
	}
	
	public int convert(StringBuilder output, int number) {
		int current3Digits = number / divisor;
		if (current3Digits == 0) return number;
		
		String result = convertThreeDigits(current3Digits);
		Optional.of(result)
			.filter(this::isNotEmpty)
			.ifPresent(r -> output.append(r).append(suffix));
		return number % divisor;
		
	}
	
	private String convertThreeDigits(int number) {
		String result = "";
		String hundreds = mappers.below20().get(number / 100);
		if (!isEmpty(hundreds)) {
			result = result.concat(hundreds).concat(HUNDRED);
		}
		int last2Digits = number % 100;
		if (!isEmpty(hundreds) && last2Digits != 0) {
			result = result.concat(AND);
		}
		return result.concat(convertLast2Digits(last2Digits));
	}
	
	private String convertLast2Digits(int number) {
		
		int tens = (number / 10) * 10;
		int ones = (number % 10);
		
		return
		Optional.ofNullable(mappers.below20().get(number))
			.orElseGet(() -> mappers.tenMultiples().get(tens).concat(mappers.below20().get(ones)));
		
	}
	
	private boolean isNotEmpty(String s) {
		return !isEmpty(s);
	}
	
	private boolean isEmpty(String s) {
		return EMPTY.equals(s);
	}
}
