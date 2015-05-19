/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RGTHandler {
	
	private ArrayList<String> imageIdList;
	
	public RGTHandler( File rGTFile ) {
		
		this.imageIdList = new ArrayList<>();
		
		try(FileInputStream fileResource = new FileInputStream(rGTFile)) {
		
			BufferedReader reader = new BufferedReader(new InputStreamReader(fileResource));
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				
				// separatorIndex = line.indexOf(",");
				// id 		 -> line.substring(0,line.indexOf(","))
				// relevanta -> line.substring(line.indexOf(",")+1)
				if(line.substring(line.indexOf(",")+1).equals("1")) {
					this.imageIdList.add(line.substring(0,line.indexOf(",")));
				}
				
			}
			
			reader.close();
		
		}
                catch(IOException e)
                {
                    e.printStackTrace();
                }
	 
	}
	public boolean contains(String imageId) {
		return this.imageIdList.contains(imageId);
	}
        public ArrayList<String> getImages()
        {
            return imageIdList;
        }
	
}