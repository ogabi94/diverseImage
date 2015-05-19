/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author Bibi
 */
public class ImageParser {
    private ArrayList<File> files;
    private DocumentBuilderFactory builderFactory;
    private DocumentBuilder builder;
    private int nrFiles;
    private ImageObj[] images;
    private int nrImages;
    public ImageParser(ArrayList<File> f,int nrOfFiles)
    {
        files=new ArrayList();
        files=f;
        nrFiles=nrOfFiles;
        builder=null;
        images=new ImageObj[1000];
    }
    public void parseXMLS()
    {
        int i,j,k;
        NodeList list;
        Element elem;
        String date,desc,id,title,url,username;
        String[] tags;
        builderFactory=DocumentBuilderFactory.newInstance();
        int license,nbComments,rank,views;
        float latitude,longitude;
        try
        {
            builder=builderFactory.newDocumentBuilder();
        }
        catch(ParserConfigurationException cfe)
        {
            cfe.printStackTrace();
        }
        nrImages=0;
        for(i=0;i<nrFiles;i++)
        {
            try
            {
                Document document=builder.parse(files.get(i));
                document.getDocumentElement().normalize();
                list=document.getElementsByTagName("photo");
                for(j=0;j<list.getLength();j++)
                {                    
                    Node node=list.item(j);
                    if(node.getNodeType()==Node.ELEMENT_NODE)
                    {
                        elem=(Element)node;
                        date=elem.getAttribute("date_taken");
                        desc=elem.getAttribute("description");
                        id=elem.getAttribute("id");
                        latitude=Float.parseFloat(elem.getAttribute("latitude"));
                        license=Integer.parseInt(elem.getAttribute("license"));
                        longitude=Float.parseFloat(elem.getAttribute("longitude"));
                        nbComments=Integer.parseInt(elem.getAttribute("nbComments"));
                        rank=Integer.parseInt(elem.getAttribute("rank"));
                        tags=elem.getAttribute("tags").split(" ");
                        title=elem.getAttribute("title");
                        url=elem.getAttribute("url_b");
                        username=elem.getAttribute("username");
                        views=Integer.parseInt(elem.getAttribute("views"));
                        images[nrImages]=new ImageObj(date,desc,id,latitude,license,longitude,nbComments,rank,tags,title,url,username,views);
                        nrImages++;
                    }
                }
            }
            catch(SAXException e)
            {
                e.printStackTrace();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        } 
    }
    public ImageObj[] getImages()
    {
        return images;
    }
    public int getNrImages()
    {
        return nrImages;
    }
}
