package procesareImagini;


import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * autor: modulul 3 
 * 
 * ResizeImg va redimensiona imaginile astfel, ne va ajuta la performanta algoritmului de diversificare 
 */


public class ResizeImg {

    private   int IMG_WIDTH ;
    private   int IMG_HEIGHT ;

    /**
     * 
     * @param originalImage calea catre imaginea pe care vrem sa o redimensionam
     * @param type tipul mime al imaginii
     */
    public BufferedImage resizeImage(BufferedImage originalImage, int type) {
        BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
        g.dispose();

        return resizedImage;
    }
    
    /**
     * va seta latimea pentru noua imagine
     * @param x = valoarea noii latimi
     */
    public void setWidth(int x)
    {
    	IMG_WIDTH=x;
    }
    
    /**
     * va seta lungimea noii imagini
     * @param y este valoarea noii inaltimi
     */
    public void setHeight(int y)
    {
    	IMG_HEIGHT=y;
    }
    
    	/**
    	 * @return returneaza inaltimea la care a fost setata imaginea
    	 */
     int getHeigth()
	    {
	    	return IMG_HEIGHT;
	    }
    
     /**
      * @return returneaza latimea la care a fost setata imaginea
      */
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
