﻿import static org.junit.Assert.*;

import org.junit.Test;


public class extractHistogramTest {

	double result;
	
	@Test
	public void testRedHistogram() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int[] vector={46,47,37,56,66,76,115,119,138,158,173,204,224,221,262,224,276,338,402,433,493,562,579,584,658,687,779,736,755,813,781,832,779,881,924,925,907,946,937,903,905,883,802,798,769,778,665,707,626,591,615,561,595,502,481,508,507,480,422,435,412,392,371,381,329,350,307,315,310,302,276,274,255,213,240,218,225,215,198,194,194,218,168,218,190,166,164,162,168,151,179,140,166,141,149,135,139,139,152,141,139,105,145,148,127,133,132,120,124,124,101,119,92,98,110,98,135,105,100,97,93,102,98,99,88,86,75,70,83,77,78,87,75,73,75,69,81,77,68,48,52,51,69,60,61,56,42,52,51,63,43,45,41,67,61,40,36,47,63,47,40,68,46,49,45,64,60,53,50,57,52,69,60,51,67,54,73,78,72,64,72,69,70,71,77,108,77,74,71,74,93,102,96,102,126,118,129,140,176,201,191,223,244,310,242,322,341,317,323,318,352,354,332,408,322,338,337,345,339,370,374,398,411,395,385,419,395,390,399,364,365,401,370,374,382,372,378,316,356,324,292,248,247,214,198,216,198,153,148,116,98,93,58,66,49,264};
		assertArrayEquals(vector, ex.redHistogram());
	}
	
	@Test
	public void testGreenHistogram() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int[] vector={365,117,83,41,47,27,30,38,34,55,37,35,36,36,31,45,51,41,55,102,124,98,105,89,117,128,146,170,127,120,142,168,176,174,211,225,210,237,270,322,313,339,349,363,384,452,479,561,536,602,594,628,602,633,652,648,652,690,738,817,702,774,724,727,724,705,731,672,720,681,641,663,608,619,625,621,645,650,620,594,626,709,635,606,665,672,635,614,601,641,638,634,601,609,613,540,543,512,503,466,472,448,394,389,406,378,325,355,327,305,287,280,271,255,282,274,287,300,273,268,282,305,259,274,290,241,249,251,270,255,275,269,262,262,234,232,277,270,251,217,224,221,211,225,221,242,240,220,226,248,206,203,239,237,242,226,238,246,230,244,214,230,252,234,217,201,188,202,174,196,180,161,171,169,147,138,158,127,165,155,135,117,142,147,146,123,121,115,132,133,142,100,113,98,111,130,123,108,118,115,96,103,92,77,76,83,65,80,57,83,61,76,69,78,72,59,46,39,37,40,30,26,15,10,12,11,10,9,9,10,11,6,13,12,9,2,15,15,7,9,6,8,13,8,11,9,8,5,5,7,9,8,9,7,18,31};
		assertArrayEquals(vector, ex.greenHistogram());
	}
	
	@Test
	public void testBlueHistogram() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int[] vector={1315,147,164,196,184,214,204,241,238,252,287,312,336,401,435,516,548,551,584,687,688,657,751,772,808,827,959,1017,1041,1153,1153,1058,1177,1154,1196,1340,1266,1356,1285,1288,1169,1178,1188,1083,1083,1032,974,1018,916,848,904,880,884,879,865,778,747,732,766,629,636,678,585,593,569,554,565,573,508,464,498,444,430,367,344,335,357,291,289,287,266,249,238,219,236,231,218,215,188,154,154,158,136,155,157,139,119,136,131,92,98,88,92,94,88,74,87,79,87,75,74,78,75,72,91,82,71,84,77,57,57,52,59,66,59,59,52,67,54,42,53,63,59,52,61,48,50,77,42,66,59,58,51,42,42,48,47,50,48,44,31,39,59,43,59,56,34,53,38,39,44,33,32,41,47,27,39,24,38,24,28,20,36,28,33,37,29,31,19,27,23,34,26,27,20,29,23,17,30,25,30,23,11,22,18,23,24,16,19,18,14,13,14,20,17,15,15,20,10,13,19,17,13,15,12,9,12,14,15,8,5,6,9,8,9,7,3,10,6,6,4,6,9,5,4,5,6,5,2,1,3,4,3,2,3,4,1,1,4,8,5,0,1,3,4,24};
		assertArrayEquals(vector, ex.blueHistogram());
	}
	
	@Test
	public void testRedMean() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int mean=102;
		assertEquals("Rezultat: ",mean,ex.redMean(),result);
	}
	
	@Test
	public void testGreenMean() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int mean=95;
		assertEquals("Rezultat: ",mean,ex.greenMean(),result);
	}
	
	@Test
	public void testBlueMean() {
		extractHistogram ex = new extractHistogram("C:\\USERS\\Cris\\Desktop\\","flower2.jpg");
		int mean=50;
		assertEquals("Rezultat: ",mean,ex.blueMean(),result);
	}
	

}
