package teste;

/*
clasa redimensioneaza imaginile, va ajuta la algoritmul de filtrare
*/

import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/*
* clasa principala unde am un exemplu de utilizare a codului
*/
public class ResizeImaginee {
	
/*
 * dimensiunea finala a imaginii
 */
private static final int IMG_WIDTH = 200;
private static final int IMG_HEIGHT = 2000;

/*
 * clasa main
 */
public static void main(String [] args){
try{

	BufferedImage originalImage = ImageIO.read(new File("aaa.jpg")); //inputul
	int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
	
	BufferedImage resizeImageJpg = resizeImage(originalImage, type);
	ImageIO.write(resizeImageJpg, "jpg", new File("aa.jpg"));  //outputul

}catch(IOException e){
	System.out.println(e.getMessage());
}

}

/*
 * metoda apelata din functia main pentru a face resize la imagine
 */
private static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose();
 
	return resizedImage;
}

/*
private static BufferedImage resizeImageWithHint(BufferedImage originalImage, int type){

		BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
		g.dispose();	
		g.setComposite(AlphaComposite.Src);
	 
		g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
		RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g.setRenderingHint(RenderingHints.KEY_RENDERING,
		RenderingHints.VALUE_RENDER_QUALITY);
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);

	return resizedImage;
}

*/
}
