package procesareImagini;

import static org.junit.Assert.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ResizeImgTest {
	 double rezultat;
	 boolean thrown = false;
	  
	@Test
	public  void testDimensionH() throws Exception {
		ResizeImg te= new ResizeImg();
		te.setHeight(1000);
		assertEquals("Rezultat: " ,1000,te.getHeigth(),rezultat);
	}
	
	
	@Test
	public  void testDimensionW() throws Exception {
		ResizeImg te= new ResizeImg();
		te.setWidth(1000);
		
		assertEquals("Rezultat: " ,1000,te.getWidth(),rezultat);
	}
	
	
	@Test
	public  void imagineDimensiune() throws Exception {
		
	try {
		ResizeImg img = new ResizeImg();
		
	    BufferedImage originalImage = ImageIO.read(new File("E:\\proiectip\\user01\\user01\\Div400\\devset\\devsetkeywords\\img\\asdad\\1.jpg"));
	    int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		img.resizeImage(originalImage, type);
		
		
	  BufferedImage originalImage2 = ImageIO.read(new File("E:\\proiectip\\user01\\user01\\Div400\\devset\\devsetkeywords\\img\\asdad\\1.jpg"));
      int type2 = originalImage2.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage2.getType();
      BufferedImage resizeImageJpg2=img.resizeImage(originalImage2,type2);
		
      assertEquals("Rezultat: " ,1000,resizeImageJpg2.getHeight(),rezultat);
		
    } 

	catch (IllegalArgumentException e) 
		{
		    thrown = true;
		}
		assertTrue(thrown);
	}

}
