package jUnits;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class StringFunctionTest {
	@Test
public void Test1()
{
	assertTrue(StringFunctions.isPalindrom("RADAR"));
}
@Test
public void Test2()
{
	assertFalse(StringFunctions.isPalindrom("PRIYA"));
}
@DisplayName("Example of Repeated Test")
@RepeatedTest(4)
public void Test3()
{
	assertTrue(StringFunctions.isPalindrom("MOM"));
}
}
