/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Entity;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException; 
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.*;
import java.io.PrintWriter;
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 *
 * @author Bibi
 */
public class DiverseImage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    String[] files=new String[20];
    ImageObj[] images;
    files[0]="Admiralty Arch London.xml";
    files[1]="Angel Falls Venezuela.xml";
    files[2]="Boyana Church Sofia.xml";
    ImageParser parser=new ImageParser(files,3);
    parser.parseXMLS();
    images=parser.getImages();
    int n=parser.getNrImages();
    for(int i=0;i<n;i++)
    {
        System.out.println(images[i].getDescription());
    }
    System.out.println(n);
}
    
}
