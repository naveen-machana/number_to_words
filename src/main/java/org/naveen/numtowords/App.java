package org.naveen.numtowords;

import java.util.List;

public class App 
{
	
    public static void main( String[] args )
    {
        Mappers mappers = new Mappers();
        List<Converter> converters = Configuration.getConvertersList(mappers);
        
        	int input = 1000;
		StringBuilder output = new StringBuilder();
		for (Converter converter : converters) {
				input = converter.convert(output, input);
		}

		System.out.println(output);
        	
    }

}
