package Sohan_Class_9.Sohan_Class_9;

import java.math.BigDecimal;
import java.util.Arrays;

import junit.framework.TestCase;

public class MainTest extends TestCase {

	public void testSort_By_Name() {
	
		assertEquals(true, new Sorting().Sort_By_Name(Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),new Developer("alvin", new BigDecimal("80000"), 20),new Developer("jason", new BigDecimal("100000"), 10),new Developer("iris", new BigDecimal("170000"), 55))));
	}

	public void testSort_By_age() {
		assertEquals(true, new Sorting().Sort_By_Name(Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),new Developer("alvin", new BigDecimal("80000"), 20),new Developer("jason", new BigDecimal("100000"), 10),new Developer("iris", new BigDecimal("170000"), 55))));
	}

	public void testSort_By_Salary() {
		assertEquals(true, new Sorting().Sort_By_Name(Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),new Developer("alvin", new BigDecimal("80000"), 20),new Developer("jason", new BigDecimal("100000"), 10),new Developer("iris", new BigDecimal("170000"), 55))));
	}

	public void testSort_By_lombok() {
		assertEquals(true, new Sorting().Sort_By_Name(Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),new Developer("alvin", new BigDecimal("80000"), 20),new Developer("jason", new BigDecimal("100000"), 10),new Developer("iris", new BigDecimal("170000"), 55))));
	}

	public void testGetDevelopers() {
		assertEquals(true, new Sorting().Sort_By_Name(Arrays.asList(new Developer("mkyong", new BigDecimal("70000"), 33),new Developer("alvin", new BigDecimal("80000"), 20),new Developer("jason", new BigDecimal("100000"), 10),new Developer("iris", new BigDecimal("170000"), 55))));
	}

}
