/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgrafic;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class ResizeImgTest {
    
    public ResizeImgTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of resizeImage method, of class ResizeImg.
     */
    @Test
    public void testResizeImage() throws IOException {
        System.out.println("resizeImage");
        ResizeImg resz=new ResizeImg();
        
        URL prim1 = new URL("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        BufferedImage orig = ImageIO.read(prim1);
        
        
 
        BufferedImage resizeImageJpg = resz.resizeImage(orig, BufferedImage.TYPE_INT_ARGB);
        
        
     
        int type = BufferedImage.TYPE_INT_ARGB;
        ResizeImg instance = new ResizeImg();
        BufferedImage expResult = resizeImageJpg;
        BufferedImage result = instance.resizeImage(orig, type);
        
        if(expResult.getHeight()*expResult.getWidth()!=result.getHeight()*result.getWidth())
  
            fail("The test case is a prototype.");
    }
    
       @Test
    public void testResizeImage1() throws IOException {
        System.out.println("resizeImage");
        ResizeImg resz=new ResizeImg();
        
      
        BufferedImage orig = null;
        
        
 
        BufferedImage resizeImageJpg = resz.resizeImage(orig, BufferedImage.TYPE_INT_ARGB);
        
        
     
        int type = BufferedImage.TYPE_INT_ARGB;
        ResizeImg instance = new ResizeImg();
        BufferedImage expResult =null;
        BufferedImage result = instance.resizeImage(orig, type);
        
        if(result==expResult)
  
            fail("Imaginea este nula");
    }
}
