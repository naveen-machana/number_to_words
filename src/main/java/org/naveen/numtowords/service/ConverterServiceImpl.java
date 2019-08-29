package org.naveen.numtowords.service;

import static ong.naveen.numtowords.constants.Constants.INVALID;

import java.util.List;

import org.naveen.numtowords.validators.Validators;

public class ConverterServiceImpl implements ConverterService {

	private Validators validator;
	private List<Converter> converters;

	public ConverterServiceImpl(Validators validator, List<Converter> converters) {
		this.validator = validator;
		this.converters = converters;
	}

	@Override
	public String convert(String inputText) {
		if (!validator.isValid(inputText)) {
			System.out.println("Invalid input. Please enter integers in the range of [1- 999,999,999]");
			return INVALID;
		}

		Integer input = Integer.parseInt(inputText);
		StringBuilder output = new StringBuilder();
		for (Converter converter : converters) {
			input = converter.convert(output, input);
		}

		System.out.println(output);
		return output.toString();
	}

}
