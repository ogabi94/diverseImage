package imageAttributes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.InvalidParameterException;

/**
 * @author fOcus	Andrei Chelaru - A3
 */
public class ImageAttributes {

	private	String	initPath	=	null;


	
	/**
	 * @param path	path to the visual descriptors library, where all .csv files are located
	 */
	public ImageAttributes( String path )
	{
		initPath	=	path;
	}
	
	
	
	
	/**
	 * returns pseudo-euclidean distance using CN visual descriptors
	 * @param folder	folder containing subset of images to test
	 * @param file1
	 * @param file2
	 * @return			value of distance using CN (Color Naming Histogram for the 11 most used colors)
	 */
	public double getDistance_CN( String folder, String file1, String file2 )
	{
		String	descriptorsFile	=	initPath + "/descvis/img/" + folder + " CN.csv";

		String fileID1	=	extractIDfromFileName(file1);
		String fileID2	=	extractIDfromFileName(file2);
		
		

		return processDescriptorFile(fileID1, fileID2, descriptorsFile);
	}
	
	/**
	 * returns pseudo-euclidean distance using HOG visual descriptors
	 * @param folder	folder containing subset of images to test
	 * @param file1
	 * @param file2
	 * @return			value of distance using HOG  (histogram of oriented gradients)
	 */
	public double getDistance_HOG( String folder, String file1, String file2 )
	{
		String	descriptorsFile	=	initPath + "/descvis/img/" + folder + " HOG.csv";

		String fileID1	=	extractIDfromFileName(file1);
		String fileID2	=	extractIDfromFileName(file2);
		
		

		return processDescriptorFile(fileID1, fileID2, descriptorsFile);
	}
	
	/**
	 * returns pseudo-euclidean distance using CM visual descriptors
	 * @param folder	folder containing subset of images to test
	 * @param file1
	 * @param file2
	 * @return			value of distance using CM (Color Moments)
	 */
	public double getDistance_CM( String folder, String file1, String file2 )
	{
		String	descriptorsFile	=	initPath + "/descvis/img/" + folder + " CM.csv";

		String fileID1	=	extractIDfromFileName(file1);
		String fileID2	=	extractIDfromFileName(file2);
		
		

		return processDescriptorFile(fileID1, fileID2, descriptorsFile);
	}
	
	/**
	 * returns pseudo-euclidean distance using CSD visual descriptors
	 * @param folder	folder containing subset of images to test
	 * @param file1
	 * @param file2
	 * @return			value of distance using CSD (Color Structure Descriptor)
	 */
	public double getDistance_CSD( String folder, String file1, String file2 )
	{
		String	descriptorsFile	=	initPath + "/descvis/img/" + folder + " CSD.csv";

		String fileID1	=	extractIDfromFileName(file1);
		String fileID2	=	extractIDfromFileName(file2);
		
		

		return processDescriptorFile(fileID1, fileID2, descriptorsFile);
	}
	
	
	
	/**
	 * process cvasi-euclidean distance between 2 files described in the descriptor file
	 * @param ID1	ID1 of first file inside the descriptor .csv file  
	 * @param ID2	ID of second file inside the descriptor .csv file  
	 * @return		value of disance	
	 */
	private double processDescriptorFile( String ID1, String ID2, String descriptorFileName )
	{
		String line=null;
		String[]	propVector1		=	null;
		String[]	bpropVector2	=	null;

		BufferedReader bufReader = null;

		try {
			bufReader = new BufferedReader(new FileReader(descriptorFileName));
		
			while( (line=bufReader.readLine()) != null )
			{
//				System.out.println(line);
		
				
				if(line.startsWith(ID1))
				{
					propVector1 =	line.split(ID1 + "[,]")[1].split("[,]");
				}
				
				if(line.startsWith(ID2))
				{
					bpropVector2 =	line.split(ID2 + "[,]")[1].split("[,]");
				}
				
			}
			
			bufReader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return calcDist(propVector1,bpropVector2);
	}
	
	
	/**
	 * calculates simple( pseudo-euclidean) distance between 2 files, described by their property vector ( Color hist., Hist. of oriented gradients, etc. )
	 * @param a		vector describing first file
	 * @param b		vector describing second file
	 * @return		pseudo-euclidean distance calculated based on vectors
	 */
	private double calcDist(String[]a, String[] b)
	{
		double ret	=	0;
		
		if( (a!=null) && (b!=null) && (a.length == b.length))
		{
			for(int i=0; i<a.length; i++)
			{
				ret	=	ret+( Math.abs( Double.parseDouble(a[i]) - Double.parseDouble(b[i]) ) );
//				System.out.println(a[i]);
			}
		}else{
			throw(new InvalidParameterException("parametri invalizi"));
		}
		
		return ret;
	}
	

	/**
	 * returns ID (number) from file name; eg.: 123456.jpg - results 123456
	 * @param	fileName	input file
	 * @return	ID number value
	 */
	private String extractIDfromFileName(String fileName)
	{
		String[]	fileIDarray	=	fileName.split("[.]");

		String	fileID;
		
		if( fileIDarray.length == 2 )
		{
			fileID	=	fileIDarray[0];
		}else{
			throw(new InvalidParameterException("nume fisiere eronate"));
		}
		
		return fileID;
	}
}
