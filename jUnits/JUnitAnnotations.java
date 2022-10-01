package jUnits;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class JUnitAnnotations {

@BeforeAll
public void beforeall()
{
	System.out.println("Before All");
}

@BeforeEach
public void beforeEach()
{
	System.out.println("Before Each");
}


	


	
	
	public void Test1() {
		
	assertEquals(11,Calculator.add(5,6));	
	}

@AfterEach
public void afterEach()
{
	System.out.println("After Each");
}

@AfterAll
public void afterAll()
{
	System.out.println("After All");
}


}
