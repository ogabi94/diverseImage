/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;

import java.util.ArrayList;

/**
 *
 * @author Bibi
 */
public class Cluster {
private String name;
private ArrayList<ImageObj> images;

public Cluster(String nume)
{
    images=new ArrayList();
    name=nume;
}
public void addImage(ImageObj obj)
{
    images.add(obj);
}
public String getName()
{
    return name;
}
public ArrayList<ImageObj> getImages()
{
    return images;
}
}
