package org.naveen.numtowords;

import java.util.List;
import java.util.Scanner;

import org.naveen.numtowords.config.Configuration;
import org.naveen.numtowords.config.Mappers;
import org.naveen.numtowords.service.Converter;
import org.naveen.numtowords.service.ConverterService;
import org.naveen.numtowords.service.ConverterServiceImpl;
import org.naveen.numtowords.validators.Validators;

public class App 
{
	private static Mappers mappers = new Mappers();
    private static List<Converter> converters = Configuration.getConvertersList(mappers);
    private static Validators validator = new Validators();
    
    /*
     * The program works in the following way
     * List of converters are prepared from Configuration object.
     * First converter converts given input which is above 999999 and converts 3 digits that  
     * are in million range, and then pass on the last 6 digits to thousands converter
     * Second thousand converter converts 3 digits which are in thousands range
     * and pass on the last 3 digits to hundreds converter.
     * Third hundreds converter converts last 3 digits.
     * During the flow output from each converter would be appended to a string builder
     * before passing on to the next converter.
     * */
    
    public static void main( String[] args )
    {
    		try (Scanner inputReader = new Scanner(System.in)) {
    			while (true) {
    				System.out.println("Enter your input: ");
    				String input = inputReader.next();
    				convert(input);
    			}    			
    		}
    }
    
    public static String convert(String inputText) {
        ConverterService converterService = new ConverterServiceImpl(validator, converters);
    		return converterService.convert(inputText);
    }

}
