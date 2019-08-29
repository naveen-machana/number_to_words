package org.naveen.numtowords;

import junit.framework.Assert;
import junit.framework.TestCase;
import ong.naveen.numtowords.constants.Constants;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }
    
    private App app = new App();
    private String INVALID = "Invalid";
    
    public void testZero() {
    		String output = app.convert("0");
    		Assert.assertEquals(INVALID, output);
    }
    
    public void testNegativeNumber() {
		String output = app.convert("-123");
		Assert.assertEquals(INVALID, output);
    }

    public void testFloatingPointNumbers() {
		String output = app.convert("123.0");
		Assert.assertEquals(INVALID, output);
    }
    
    public void testNonNumbers() {
		String output = app.convert("hey");
		Assert.assertEquals(INVALID, output);
    }
    
    public void testOneBillionNumber() {
		String output = app.convert("1000000000");
		Assert.assertEquals(INVALID, output);
    }
    
    public void testSingleDigit() {
    		String output = app.convert("1");
    		Assert.assertEquals(Constants.ONE, output);
    }
    
    public void testTeens() {
		String output = app.convert("11");
		Assert.assertEquals(Constants.ELEVEN, output);
    }
    
    public void testTenMultiples() {
		String output = app.convert("20");
		Assert.assertEquals(Constants.TWENTY, output);
    }
    
    public void testTwoDigitInput() {
		String output = app.convert("99");
		Assert.assertEquals("ninety nine ", output);
    }
    
    public void testHundred() {
    		String output = app.convert("100");
    		Assert.assertEquals("one hundred ", output);
    }
    
    public void test123() {
    		String output = app.convert("123");
    		Assert.assertEquals("one hundred and twenty three ", output);
    }
    
    public void test99101() {
		String output = app.convert("99101");
		Assert.assertEquals("ninety nine thousand one hundred and one ", output);
    }
    
    public void test1000099() {
    		String output = app.convert("1000099");
    		Assert.assertEquals("one million ninety nine ", output);
    }
    
}
