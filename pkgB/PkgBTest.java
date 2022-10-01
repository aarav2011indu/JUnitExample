package pkgB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import jUnits.StringFunctions;


@Tag("Sanity")
@Tag("Nightly")
public class PkgBTest {

	
	@Test
	@DisplayName("part of pkg B")
	public void Test1()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	
	
	@Test
	@DisplayName("part of pkg B")
	public void Test2()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
