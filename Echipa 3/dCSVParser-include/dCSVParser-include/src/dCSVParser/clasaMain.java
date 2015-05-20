package dCSVParser;

public class clasaMain{
	public static void main(String[] args){
		
		CM_Parser cm =  new CM_Parser();
		System.out.println(cm.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground CM.csv"));
		
		CN_Parser cn = new CN_Parser();
		System.out.println(cn.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground CN.csv"));
		
		LBP_Parser lbp = new LBP_Parser();
		System.out.println(lbp.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground LBP.csv"));
		
		GLRLM_Parser glrlm = new GLRLM_Parser();
		System.out.println(glrlm.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground GLRLM.csv"));
		
		CSD_Parser csd = new CSD_Parser();
		System.out.println(csd.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground CSD.csv"));
		
		HOG_Parser hog = new HOG_Parser();
		System.out.println(hog.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground HOG.csv"));
		
		CM3x3_Parser cm3x3 = new CM3x3_Parser();
		System.out.println(cm3x3.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground CM3x3.csv"));
		
		CN3x3_Parser cn3x3 = new CN3x3_Parser();
		System.out.println(cn3x3.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground CN3x3.csv"));

	
		LBP3x3_Parser lbp3x3 = new LBP3x3_Parser();
		System.out.println(lbp3x3.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground LBP3x3.csv"));
		
		GLRLM3x3_Parser glrlm3x3 = new GLRLM3x3_Parser();
		System.out.println(glrlm3x3.parse("C:\\Users\\CRIS\\Desktop\\IP__parseCSV\\African Burial Ground GLRLM3x3.csv"));
	
	}
}
