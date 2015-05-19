/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Bibi
 */

public class Search {

	private static File director = new File(".");
	private ArrayList<File> fisiere=new ArrayList<File>();
	public Search() {
	}
	private void cautaRec(File dir,String fisier)
	{
		try {
			File[] files = dir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					cautaRec(file,fisier);
				} else {
					System.out.println("     file:" + file.getCanonicalPath());
					if(file.getName().contains(fisier))
					{
						System.out.println("     file:" + file.getCanonicalPath());
						fisiere.add(file);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<File> cauta(String nume)
	{
		cautaRec(director,nume);
		return fisiere;
		
	}
}
