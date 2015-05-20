/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgrafic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
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
public class ModulGraficTest {
    
    public ModulGraficTest() {
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
     * Am testat daca dintr-o lista cu 3 imagini (2 identice si.1 diferita) lista admisa are dimensiunea 2.
     */
    @Test
    public void testFirstFilter() throws Exception {
        System.out.println("firstFilter");
        ArrayList<String> c = new ArrayList<>();
        c.add("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        ModulGrafic instance = new ModulGrafic();
       
        instance.firstFilter(c);
         System.out.println(instance.getMat().size());
        if(instance.getMat().size()!=2)

       fail("The test case is a prototype.");
    }
    
     /**
     * Am testat daca dintr-o lista cu 6 imagini (5 identice si.1 diferita) lista admisa are dimensiunea 2.
     */
    
    @Test
    public void testFirstFilter1() throws Exception {
        System.out.println("firstFilter");
        ArrayList<String> c = new ArrayList<>();
        c.add("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        ModulGrafic instance = new ModulGrafic();
        instance.firstFilter(c);
       for (int i = 0; i < instance.getMat().size(); i++) {
            System.out.println(instance.getMat().get(i));

        }
        System.out.println(instance.getMat().size());
        if(instance.getMat().size()!=2)

       fail("The test case is a prototype.");
    }
// Verificari in caz de lista este vida
       @Test
    public void testFirstFilter2() throws Exception {
        System.out.println("firstFilter");
        ArrayList<String> c = new ArrayList<>();
 
        ModulGrafic instance = new ModulGrafic();
        instance.firstFilter(c);
       for (int i = 0; i < instance.getMat().size(); i++) {
            System.out.println(instance.getMat().get(i));

        }
        System.out.println(instance.getMat().size());
        if(instance.getMat().size()==0)

       fail("Lista este vida.");
    }

    /**
     * Test of Detector method, of class ModulGrafic.
     */
/*    @Test
    public void testDetector() {
        System.out.println("Detector");
        URL url = null;
        ModulGrafic instance = new ModulGrafic();
        BufferedImage expResult = null;
        BufferedImage result = instance.Detector(url);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/

}
