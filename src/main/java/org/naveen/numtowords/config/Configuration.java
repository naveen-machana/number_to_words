package org.naveen.numtowords.config;

import static ong.naveen.numtowords.constants.Constants.EMPTY;
import static ong.naveen.numtowords.constants.Constants.MILLION;
import static ong.naveen.numtowords.constants.Constants.THOUSAND;

import java.util.ArrayList;
import java.util.List;

import org.naveen.numtowords.service.Converter;

public class Configuration {
	
	public static List<Converter> getConvertersList(Mappers mappers) {
		List<Converter> converters = new ArrayList<>();
		converters.add(new Converter(MILLION, 1000_000, mappers));
		converters.add(new Converter(THOUSAND, 1000, mappers));
		converters.add(new Converter(EMPTY, 1, mappers));
		return converters;
	}
}
