package imageAttributes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class ImageAttributes {

	/**
	 * @author fOcus	Andrei Chelaru - A3
	 */
	
	private	String	initPath	=	null;
	
	public ImageAttributes( String path )
	{
		initPath	=	path;
	}
	
	public double getDistance_CN( String folder, String file1, String file2 )
	{
		double	ret = 0;

		String[]	fileID1arr	=	file1.split("[.]");
		String[]	fileID2arr	=	file2.split("[.]");

		//System.out.println( fileID1arr );

		String	fileID1;
		String	fileID2;
		
		if(( fileID1arr.length == 2 ) && ( fileID2arr.length == 2 )){
			fileID1	=	fileID1arr[0];
			fileID2	=	fileID2arr[0];
		}else{
			throw(new InvalidParameterException("nume fisiere eronate"));
		}
		
//		String	f1	=	initPath + "/img/" + folder + "/" +  file1;
		String	inFile	=	initPath + "/descvis/img/" + folder + " CN.csv";

		BufferedReader bufReader = null;
		try {
			bufReader = new BufferedReader(new FileReader(inFile));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String line=null;

		String[]	a	=	null;
		String[]	b	=	null;
		
		try {
			while( (line=bufReader.readLine()) != null )
			{
//				System.out.println(line);
		
				
				if(line.startsWith(fileID1))
				{
					a =	line.split(fileID1 + "[,]")[1].split("[,]");
				}
				
				if(line.startsWith(fileID2))
				{
					b =	line.split(fileID2 + "[,]")[1].split("[,]");
				}
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ret	=	calcDist(a,b);
		
		return ret;
	}
	
	
	public double calcDist(String[]a, String[] b)
	{
		double ret	=	0;
		
		if( (a!=null) && (b!=null) && (a.length == b.length))
		{
			for(int i=0; i<a.length; i++)
			{
				ret	=	ret+( Double.parseDouble(a[i]) - Double.parseDouble(b[i]) );
				System.out.println(a[i]);
			}
		}else{
			throw(new InvalidParameterException("parametri invalizi"));
		}
		
		return ret;
	}
	
}
