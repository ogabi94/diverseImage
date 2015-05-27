import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
 
public class CompareWITHPixelGrabber {
	static void procesare() {		
		String file1 = "C:\\USERS\\Cris\\Desktop\\Lenna100.jpg";
		String file2 = "C:\\USERS\\Cris\\Desktop\\Lenna50.jpg";
 
		Image img1 = Toolkit.getDefaultToolkit().getImage(file1);
		Image img2 = Toolkit.getDefaultToolkit().getImage(file2);
 
		try {
			PixelGrabber g1 =new PixelGrabber(img1,0,0,-1,-1,false);
			PixelGrabber g2 =new PixelGrabber(img2,0,0,-1,-1,false);
			int[] rez1 = null;
			int[] rez2 = null;
			if (g1.grabPixels()) {
				int w = g1.getWidth();
				int h = g1.getHeight();
				rez1 = new int[w*h];
				rez1 = (int[]) g1.getPixels();
			}
			if (g2.grabPixels()) {
				int w = g1.getWidth();
				int h = g2.getHeight();
				rez2 = new int[w*h];
				rez2 = (int[]) g2.getPixels();
			}
			if(java.util.Arrays.equals(rez1, rez2))
				System.out.println("Imaginile sunt identice.");
			else
				System.out.println("Imaginile sunt diferite.");
		} catch (InterruptedException excep) {
			excep.printStackTrace();
		}
	}
	public static void main(String args[]) {
		procesare();
	}
}