package ipSearch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

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
					if(file.getName().matches("[a-zA-Z0-9 ]*(("+fisier+".xml)|("+fisier+")[ ][a-zA-Z0-9 ]*.xml)"))
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
