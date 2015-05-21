/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgrafic;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javafx.beans.binding.Bindings;
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
public class Filter1Test {

    public Filter1Test() {
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
     * Am testat daca pentru 2 imagini identice constanta de similaritate este egala cu 0.
     */
    @Test
    public void testShowDifference() throws MalformedURLException, IOException {
        System.out.println("showDifference");
        URL prim = new URL("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        BufferedImage im1 = ImageIO.read(prim);

        URL scnd = new URL("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        BufferedImage im2 = ImageIO.read(scnd);

        Filter1 instance = new Filter1();
        int expResult = 0;
        int result = instance.showDifference(im1, im2);
        System.out.println(result);
        assertEquals(expResult, result);
        if (result != expResult) {
            fail("The test case is a prototype.");
        }
    }

     /**
     * Am testat daca pentru 2 imagini distincte constanta de similaritate depaseste limita de 72000.
     * In caz contrar se va afisa un mesaj specific 
     */
    
    @Test
    public void testShowDifference1() throws MalformedURLException, IOException {
        System.out.println("showDifference");
        ResizeImg resz=new ResizeImg();
        
        URL prim = new URL("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        BufferedImage im1 = ImageIO.read(prim);
        BufferedImage resizeImageJpg = resz.resizeImage(im1, BufferedImage.TYPE_INT_ARGB);
        
        URL scnd = new URL("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        BufferedImage im2 = ImageIO.read(scnd);
        BufferedImage resizeImageJpg1 = resz.resizeImage(im2, BufferedImage.TYPE_INT_ARGB);
       
        
        Filter1 instance = new Filter1();
        int expResult = 72000;
        int result = instance.showDifference(resizeImageJpg,resizeImageJpg1);
        System.out.println(result);
       // assertEquals(expResult, result);
        assertTrue( result >= expResult );
        
    }

    
    //Se face verificare in caz de se primesc poze nule ca argument
    //
        @Test
    public void testShowDifference2() throws MalformedURLException, IOException {
        System.out.println("showDifference");
        ResizeImg resz=new ResizeImg();
        
        
        BufferedImage im1 = null;
        
        
        URL scnd = new URL("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        BufferedImage im2 = ImageIO.read(scnd);
        BufferedImage resizeImageJpg1 = resz.resizeImage(im2, BufferedImage.TYPE_INT_ARGB);
       
        
        Filter1 instance = new Filter1();
        int expResult = -1;
        int result = instance.showDifference(im1,resizeImageJpg1);
        
       
        if (result == expResult) {
            fail("Poza e invalida sau nula");
        }
    }
}
