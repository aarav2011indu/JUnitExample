package jUnits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedTestExample {
	
	
	@ValueSource(strings = {"radar","mom","dad"})
	@ParameterizedTest
	public void Test1(String arg1)
	{
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
	
	
	@CsvSource(value = {"radar:mom"},delimiter = ':')
	@ParameterizedTest
	public void Test2(String arg1)
	{
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
	
	@CsvSource(value = {"radar:radar:this is comparision test"},delimiter = ':')
	@ParameterizedTest
	public void Test3(String arg1,String arg2,String arg3)
	{
		assertEquals(arg1,arg2);
		System.out.println(arg3);
	}
}
