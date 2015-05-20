/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgrafic;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @author User
 */
public class Filter1 {

   public int showDifference(BufferedImage im1, BufferedImage im2) {
     //   BufferedImage resultImage
    //           = new BufferedImage(im1.getWidth(), im2.getHeight(), BufferedImage.TYPE_INT_ARGB);
   if(im1==null||im2==null)
       return -1;
        double THR = 40;
        int area = 0;
        for (int h = 0; h < im1.getHeight(); h++) {
            for (int w = 0; w < im1.getWidth(); w++) {
                int pix1 = 0;
                int alpha1 = 0xff & (im1.getRGB(w, h) >> 24);
                int red1 = 0xff & (im1.getRGB(w, h) >> 16);
                int green1 = 0xff & (im1.getRGB(w, h) >> 8);
                int blue1 = 0xff & im1.getRGB(w, h);

                int pix2 = 0;
                int alpha2 = 0xff & (im2.getRGB(w, h) >> 24);
                int red2 = 0xff & (im2.getRGB(w, h) >> 16);
                int green2 = 0xff & (im2.getRGB(w, h) >> 8);
                int blue2 = 0xff & im2.getRGB(w, h);

                //euclidian distance to estimate the simil.
                double dist = 0;
                dist = Math.sqrt(Math.pow((double) (red1 - red2), 2.0)
                        + Math.pow((double) (green1 - green2), 2.0)
                        + Math.pow((double) (blue1 - blue2), 2.0));
                if (dist > THR) {
                 //   resultImage.setRGB(w, h, im2.getRGB(w, h));
                    area++;
                } 
            } //w
        } //h
       // System.out.println(area);
        return area;
    }

}
