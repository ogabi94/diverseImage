/**
 * 
 */
package test_package;

import static org.junit.Assert.*;

import java.security.InvalidParameterException;

import imageAttributes.ImageAttributes;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Andrei
 *
 */
public class ImageAttrTest {

	public static ImageAttributes testInstance	=	new ImageAttributes( "E:\\github_reps\\diverseImage\\images" );
	
	double delta;

	@Test
	public void test_CN_eq() {
		//fail("Not yet implemented");
		assertEquals("Comparatie aceeasi imagine -> distanta zero: ",
				0,
				testInstance.getDistance_CN("National Museum of Art of Romania", "7290352362.jpg", "7290352362.jpg"),
				delta);
		
	}
	
	@Test
	public void test_CN_Neq() {
		//fail("Not yet implemented");
		assertNotEquals("Comparatie imagini diferite -> distanta NON-zero: ",
				0,
				testInstance.getDistance_CN("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg"),
				delta);
		
	}

	@Test
	public void test_CN_InvalidFile() {
		boolean passed = false;
		
		try{
			testInstance.getDistance_CN("National Museum of Art of Romania", "X7290352362.jpg", "7290353092.jpg");
		}catch(InvalidParameterException e){
			passed = true;
		}
		
		assertTrue(passed);
	}
	
	

	@Test
	public void test_HOG_eq() {
		//fail("Not yet implemented");
		assertEquals("Comparatie aceeasi imagine -> distanta zero: ",
				0,
				testInstance.getDistance_HOG("National Museum of Art of Romania", "7290352362.jpg", "7290352362.jpg"),
				delta);
		
	}
	
	@Test
	public void test_HOG_Neq() {
		//fail("Not yet implemented");
		assertNotEquals("Comparatie imagini diferite -> distanta NON-zero: ",
				0,
				testInstance.getDistance_HOG("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg"),
				delta);
		
	}

	@Test
	public void test_HOG_InvalidFile() {
		boolean passed = false;
		
		try{
			testInstance.getDistance_HOG("National Museum of Art of Romania", "X7290352362.jpg", "7290353092.jpg");
		}catch(InvalidParameterException e){
			passed = true;
		}
		
		assertTrue(passed);
	}
	
	
	@Test
	public void test_CSD_eq() {
		//fail("Not yet implemented");
		assertEquals("Comparatie aceeasi imagine -> distanta zero: ",
				0,
				testInstance.getDistance_CSD("National Museum of Art of Romania", "7290352362.jpg", "7290352362.jpg"),
				delta);
		
	}
	
	@Test
	public void test_CSD_Neq() {
		//fail("Not yet implemented");
		assertNotEquals("Comparatie imagini diferite -> distanta NON-zero: ",
				0,
				testInstance.getDistance_CSD("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg"),
				delta);
		
	}

	@Test
	public void test_CSD_InvalidFile() {
		boolean passed = false;
		
		try{
			testInstance.getDistance_CSD("National Museum of Art of Romania", "X7290352362.jpg", "7290353092.jpg");
		}catch(InvalidParameterException e){
			passed = true;
		}
		
		assertTrue(passed);
	}
	
	
	@Test
	public void test_CM_eq() {
		//fail("Not yet implemented");
		assertEquals("Comparatie aceeasi imagine -> distanta zero: ",
				0,
				testInstance.getDistance_CSD("National Museum of Art of Romania", "7290352362.jpg", "7290352362.jpg"),
				delta);
		
	}
	
	
	@Test
	public void test_CM_Neq() {
		//fail("Not yet implemented");
		assertNotEquals("Comparatie imagini diferite -> distanta NON-zero: ",
				0,
				testInstance.getDistance_CM("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg"),
				delta);
		
	}

	@Test
	public void test_CM_InvalidFile() {
		boolean passed = false;
		
		try{
			testInstance.getDistance_CM("National Museum of Art of Romania", "X7290352362.jpg", "7290353092.jpg");
		}catch(InvalidParameterException e){
			passed = true;
		}
		
		assertTrue(passed);
	}
	
}
