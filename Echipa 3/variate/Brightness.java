import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Brightness{
	public static void main(String[] args){
		Brightness br = new Brightness();
		try {
			ImageIO.write(br.brightnessModify(ImageIO.read(new File("C:\\USERS\\Cris\\Desktop\\cflower2.jpg")), -180),"jpg",new File("C:\\USERS\\Cris\\Desktop\\BRcflower2.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public BufferedImage brightnessModify(BufferedImage input, int factor) {
        int w = input.getWidth();
        int h = input.getHeight();
        BufferedImage output = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                Color clr = new Color(input.getRGB(i, j));
                int r, g, b;
                r = clr.getRed() + factor;
                g = clr.getGreen() + factor;
                b = clr.getBlue() + factor;
                if(r >= 256) {r = 255;
                } else if (r < 0) {
                    r = 0;}
                if (g >= 256) {g = 255;
                } else if (g < 0) {
                    g = 0;}
                if (b >= 256) {b = 255;
                } else if (b < 0) {
                    b = 0;}
                output.setRGB(i, j, new Color(r, g, b).getRGB());
            }
        }
        return output;
    }
}