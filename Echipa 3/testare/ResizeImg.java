package procesareImagini;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 *
 * @author User
 */
public class ResizeImg {

    private   int IMG_WIDTH ;
    private   int IMG_HEIGHT ;

    public BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }
    
    public void setWidth(int x)
    {
    	IMG_WIDTH=x;
    }
    
    public void setHeight(int y)
    {
    	IMG_HEIGHT=y;
    }
    
     int getHeigth()
    {
    	return IMG_HEIGHT;
    }
    
     int getWidth()
    {
    	return IMG_WIDTH;
    }
    
    
    public static void main(String [] args)
    {
    	ResizeImg re = new ResizeImg();
    	re.setHeight(1000);
    	
    	System.out.println(re.getHeigth());
    }
    
    
    
}
