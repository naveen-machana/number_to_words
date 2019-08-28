package org.naveen.numtowords;

import java.util.ArrayList;
import java.util.List;
import static org.naveen.numtowords.Constants.MILLION;
import static org.naveen.numtowords.Constants.THOUSAND;
import static org.naveen.numtowords.Constants.EMPTY;

public class Configuration {
	
	public static List<Converter> getConvertersList(Mappers mappers) {
		List<Converter> converters = new ArrayList<>();
		converters.add(new Converter(MILLION, 1000_000, mappers));
		converters.add(new Converter(THOUSAND, 1000, mappers));
		converters.add(new Converter(EMPTY, 1, mappers));
		return converters;
	}
}
