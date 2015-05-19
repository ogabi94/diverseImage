/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diverseimage;
import java.io.File;
import java.util.ArrayList;
/**
 *
 * @author Bibi
 */

public class ModulText {
	Search search=new Search();
	private ArrayList<File> file=new ArrayList<File>();
	private ArrayList<File> xmls=new ArrayList();
        private ArrayList<File> dgts=new ArrayList();
        private ArrayList<File> dgtcls=new ArrayList();
        private ArrayList<File> rgts=new ArrayList();
        private ArrayList<Cluster> clusters=new ArrayList();
        private ImageObj[] images;
	public ModulText(String place)
	{
		file=search.cauta(place);
		start();		
	}
	private void start()
	{
		for(int iterator=0;iterator<file.size();iterator++)
		{
			System.out.println(file.get(iterator).getName());
			if(file.get(iterator).getName().contains(" rGT.txt"))
			{
				//CREARE OBIECT RGT
				rgts.add(file.get(iterator));
			}
			if(file.get(iterator).getName().contains(" dGT.txt"))
			{
				//CREARE OBIECT DGT
				dgts.add(file.get(iterator));
			}
			if(file.get(iterator).getName().contains(" dclusterGT.txt"))
			{
				//CREARE OBIECT 
				dgtcls.add(file.get(iterator));
			}
			if(file.get(iterator).getName().contains(".xml"))
			{
				//CREARE XML OBIECT
				xmls.add(file.get(iterator));
			}			
		}
		
	}
	public ArrayList<Cluster> getImages()
        {
            ImageParser parser=new ImageParser(xmls,1);
            parser.parseXMLS();
            images=parser.getImages();
            int n=parser.getNrImages();
            int i,j,f,k=1;
            ArrayList<ImageObj> imagini=new ArrayList();
            ArrayList<Cluster> finalClusters=new ArrayList();
            for(i=0;i<dgts.size();i++)
            {
                DGTHandler handler=new DGTHandler(dgtcls.get(i),dgts.get(i),images,n);
                handler.ScanFiles();
                clusters=handler.getClusters();
                for(j=0;j<clusters.size();j++)
                {
                    imagini=clusters.get(j).getImages();
                    finalClusters.add(clusters.get(j));
                    for(f=0;f<imagini.size();f++)
                    {
                        System.out.println(k+"."+imagini.get(f).getURL());
                        k++;
                    }
                }
            }
            return finalClusters;
        }

}