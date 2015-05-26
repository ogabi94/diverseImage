package procesareImagini;
/**
 * autor: modulul 3 
 */
import com.javadocmd.simplelatlng.LatLng;
import com.javadocmd.simplelatlng.LatLngTool;
import com.javadocmd.simplelatlng.util.LengthUnit;

/**
 * sunt implementate doua metode care calculeaza distanta
 * cosinusului si distanta geografica
 */

public class Distances {
	
	/**
	 * @param vec1 prima imagine reprezentata ca si un vector
	 * @param vec2 a doua imagine reprezentata ca si un vector
	 * @return valoarea distantei dintre cei doi vectori
	 */
	public static double distantaCosinusului(double[] vec1, double[] vec2) {
		double innerp ,n1,n2;
		 innerp = 0;
		 n1 = 0;
		 n2 = 0;
		
		for (int i = 0; i < vec1.length; i++) {
			
			innerp += vec1[i] * vec2[i];
			n1 += vec1[i] * vec1[i];
			n2 += vec2[i] * vec2[i];
		}
		return 1 - (innerp / (Math.sqrt(n1) * Math.sqrt(n2)));
	}
	
	/**
	 * 
	 * @param geo1 vectorul cu latitudinea si longitudinea pentru prima imagine
	 * @param geo2 vectorul cu latitudinea si longitudinea pentru a doua imagine
	 * @return returneaza distanta intre cele doua imagini in kilometri
	 * @throws Exception
	 */
	private static double geoDistance(double[] geo1, double[] geo2) throws Exception {
		if (geo1[0] == 0 || geo2[0] == 0) 
		{ 
			// imaginile care nu au datele gps trecute in fisierele xml
			return -444; // nu cunoastem distanta
		}

		
			// folosim biblioteca simplelatlng
		LatLng im1 = new LatLng(geo1[0], geo1[1]);
		LatLng im2 = new LatLng(geo2[0], geo2[1]);

		double distance = LatLngTool.distance(im1, im2, LengthUnit.KILOMETER);
		if (distance < 0) 
		{
			throw new Exception("Negative distance!");
		}
		return distance;
	}
	

	/**
	 * @param scoreRank1 scorul pentru prima imagine
	 * @param scoreRank2 scorul pentru a doua imagine
	 * @return diferenta de scoruri dintre cele doua imagini
	 */
	private static double diffRankScore(double[] scoreRank1, double[] scoreRank2) {
		return Math.abs(scoreRank1[0] - scoreRank2[0]);
	}
	
	
	/**
	 * @param scoreRank1 scorul pentru prima imagine
	 * @param scoreRank2 scorul pentru a doua imagine
	 * @return media aritmetica a scorurilor celor 2 imagini
	 */
	private static double rankAverage(double[] scoreRank1, double[] scoreRank2) {
		return (scoreRank1[0] + scoreRank2[0]) / (2.0 * 300);
	}
	
}
