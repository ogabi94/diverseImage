/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulgrafic;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author User
 */
public class ResizeImg {

    private static final int IMG_WIDTH = 300;
    private static final int IMG_HEIGHT = 300;

    public BufferedImage resizeImage(BufferedImage originalImage, int type) {
        if(originalImage == null)
            return originalImage;
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }
}
