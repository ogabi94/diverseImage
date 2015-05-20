import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


public class extractHistogram {

	BufferedImage myimg=null;
	int[] Rfreq, Gfreq, Bfreq;
	int rgb, width, height;
	int rcolor, gcolor, bcolor;
	int sumR, sumG, sumB;
	
	extractHistogram(String path, String filename){
		try {
			myimg=ImageIO.read(new File(path+filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.histograma();
	}
	
	
	public void histograma(){
		Rfreq=new int[256];
        Gfreq=new int[256];
        Bfreq=new int[256];
        
        width = myimg.getWidth();
        height = myimg.getHeight();
        
        for(int i=0;i<width;i++) {
            for(int j=0;j<height;j++) {
                 
                rgb =myimg.getRGB(i,j);
                rcolor = (rgb >> 16) & 0xff;
                gcolor = (rgb >>  8) & 0xff;
                bcolor = (rgb >>  0) & 0xff;
                Rfreq[rcolor]++;
                Gfreq[gcolor]++;
                Bfreq[bcolor]++;
            }
        }
        
        for(int i=0;i<256;i++){
        	sumR+=Rfreq[i]*i;
            sumG+=Gfreq[i]*i;
            sumB+=Bfreq[i]*i;
        }
	}
	
	public int[] redHistogram(){
		return Rfreq;
	}
	
	public int[] greenHistogram(){
		return Gfreq;
	}
	
	public int[] blueHistogram(){
		return Bfreq;
	}
	
	public int redMean(){
		return sumR/(width*height);
	}
	
	public int greenMean(){
		return sumG/(width*height);
	}
	
	public int blueMean(){
		return sumB/(width*height);
	}
}
