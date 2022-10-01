package pkgA;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import jUnits.StringFunctions;

public class PkgATest {
	
	@Tag("Sanity")
	@Test
	@DisplayName("part of pkg a")
	public void Test1()
	{
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}

}
