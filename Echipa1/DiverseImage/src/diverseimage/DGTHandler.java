/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Bibi
 */
public class DGTHandler {
private File cluster;
private File fisier;
private ImageObj[] images;
private int nrImg;
ArrayList<Cluster> clusters;
public DGTHandler(File dgtCluster,File dgt,ImageObj[] imagini,int nr)
{
    clusters=new ArrayList();
    cluster=dgtCluster;
    fisier=dgt;
    images=imagini;
    nrImg=nr;
}
public void ScanFiles()
{
    try
    {
        BufferedReader brc = new BufferedReader(new FileReader(cluster));
        BufferedReader brf = new BufferedReader(new FileReader(fisier));
        String line,obj;
        int i=0,index,lineNo;
        Cluster cl;
        while ((line = brc.readLine()) != null)
        {
            i++;
            line=line.split(",")[1];//get cluster name
            cl=new Cluster(line);
            brf=new BufferedReader(new FileReader(fisier));
            while((obj = brf.readLine()) != null)
            {
                lineNo=Integer.parseInt(obj.split(",")[1]);//get cluster number
                obj=obj.split(",")[0];//get id
                if(lineNo==i)
                {
                    for(index=0;index<nrImg;index++)
                    {
                        if(obj.equals(images[index].getId()))
                        {
                            cl.addImage(images[index]);
                            //break;
                        }
                    }
                }
            }
            clusters.add(cl);
        }
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
}
public ArrayList<Cluster> getClusters()
{
    return clusters;
}
}
