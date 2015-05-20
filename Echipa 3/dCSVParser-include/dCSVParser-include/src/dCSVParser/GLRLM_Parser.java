package dCSVParser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.opencsv.CSVReader;

public class GLRLM_Parser{
	@SuppressWarnings("resource")
	ArrayList<ArrayList<Double>> parse(String filepath){
		CSVReader reader = null;
		try {
			reader = new CSVReader(new FileReader(filepath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	     String [] nextLine;
	     ArrayList<ArrayList<Double>> imagini = new ArrayList<ArrayList<Double>>();
	     try {
			while ((nextLine = reader.readNext()) != null) {
				ArrayList<Double> proprietati = new ArrayList<Double>();
				for(int i=0;i<45;i++)
					proprietati.add(Double.parseDouble(nextLine[i]));
				imagini.add(proprietati);
			 }
		} catch (IOException e) {
			e.printStackTrace();
		}
	    return imagini;
	}
}
