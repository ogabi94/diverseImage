package modulgrafic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class ModulGrafic {

    static ArrayList<ArrayList<String>> mat = new ArrayList<ArrayList<String>>();

    public  ArrayList<String> getMat() {
        return admise;
    }
    ArrayList<String> admise = new ArrayList<>();
    float total = 0;
    float total2 = 0;
    int[][] img1 = new int[3][256];
    int[][] img2 = new int[3][256];
    Filter1 filter1 = new Filter1();
    ResizeImg resz = new ResizeImg();
    Filter2 filter2 = new Filter2();

    public void addDubs(BufferedImage imagPrim, ArrayList<String> c) {
        for (int i = 1; i < c.size(); i++) {

        }

    }

    public void firstFilter(ArrayList<String> c) throws URISyntaxException {

        int peste = 0;
        float min = 90000;
        if(c.size()==0)
            return;
        admise.add(c.get(0));
        mat.add(new ArrayList<>());
        mat.get(mat.size() - 1).add(c.get(0));
        for (int i = 1; i < c.size(); i++) {
            total = 0;
            total2=0;
            peste = 0;
            for (int j = 0; j < admise.size(); j++) {

             
                try {
                    URL prim = new URL(c.get(i));
                    URL scnd = new URL(admise.get(j));
                    if(prim==null||scnd==null)
                    { 
                       return;
                    }
                    BufferedImage originalImage = ImageIO.read(prim);
                    int type = originalImage.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
                    BufferedImage resizeImageJpg = resz.resizeImage(originalImage, type);
                    
                    BufferedImage originalImage2 = ImageIO.read(scnd);
                    int type2 = originalImage2.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : originalImage2.getType();
                    BufferedImage resizeImageJpg2 = resz.resizeImage(originalImage2, type2);

                 //   BufferedImage edgeImg1=Detector(prim);
                 //   BufferedImage edgeImg2=Detector(scnd);
                    
                 //   total2=filter1.showDifference(edgeImg1, edgeImg2);
                    total = filter1.showDifference(resizeImageJpg, resizeImageJpg2);
                //    System.out.println(total2);
                    if (total < 68000) {
                        peste = 1;

                        mat.get(j).add(c.get(i));
                        break;

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            if (peste == 0) {

                admise.add(c.get(i));

                mat.add(new ArrayList<>());
                mat.get(mat.size() - 1).add(c.get(i));

            }

        }
        System.out.println("Lista:");
        for (int j = 0; j < admise.size(); j++) {
            System.out.println(admise.get(j));
        }
    }

    public void listFilesForFolder(File folder, ArrayList<String> c) {

        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry, c);
            } else {
                c.add(fileEntry.getName());
            }
        }
    }

    public BufferedImage Detector(URL url) {

        try {

            BufferedImage image = ImageIO.read(url);

            //adjust its parameters as desired
            filter2.setLowThreshold(0.5f);
            filter2.setHighThreshold(1f);

            //apply it to an image
            filter2.setSourceImage(image);
            filter2.process();

        } catch (Exception e) {
        }

        return filter2.getEdgesImage();

    }

    public static void main(String[] args) throws URISyntaxException {
        ModulGrafic c = new ModulGrafic();

      
        ArrayList<String> as = new ArrayList<>();
        //Asta va fi inlocuita cu lista cu calea catre fiecare poza   
        
        // c.listFilesForFolder(file, as);
        //Pana aici   
        as.add("http://static.flickr.com/7070/6962601851_0bbe41628c_b.jpg");
        as.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        as.add("http://static.flickr.com/3068/2662889361_0d200ec9b8_b.jpg");
        c.firstFilter(as);

        for (int i = 0; i < mat.size(); i++) {
            System.out.println(mat.get(i));

        }
    }

}
