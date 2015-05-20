import imageAttributes.ImageAttributes;


public class MainApp {

	//public static ImageAttributes	imgAtt	=	new ImageAttributes( "F:/cursuri si seminarii/Ingineria Programarii/user01/Div400/devset/devsetkeywords" );
	public static ImageAttributes	imgAtt	=	new ImageAttributes( "E:\\github_reps\\diverseImage\\images" );
	
	//"F:\\cursuri si seminarii\\Ingineria Programarii\\user01\\Div400\\devset\\devsetkeywords\\img",
	//"F:\\cursuri si seminarii\\Ingineria Programarii\\user01\\Div400\\devset\\devsetkeywords\\descvis\\img"
	
	public static void main(String[] args)
	{
		System.out.println(imgAtt.getDistance_CN("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg"));	//close
		System.out.println(imgAtt.getDistance_CN("National Museum of Art of Romania", "2735205004.jpg", "3474967838.jpg"));	//far
		System.out.println();
		
		System.out.println(imgAtt.getDistance_HOG("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg")); //close
		System.out.println(imgAtt.getDistance_HOG("National Museum of Art of Romania", "2735205004.jpg", "3474967838.jpg")); //far
		System.out.println();
		
		
		System.out.println(imgAtt.getDistance_CM("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg")); //close
		System.out.println(imgAtt.getDistance_CM("National Museum of Art of Romania", "2735205004.jpg", "3474967838.jpg")); //far
		System.out.println();

		System.out.println(imgAtt.getDistance_CSD("National Museum of Art of Romania", "7290352362.jpg", "7290353092.jpg")); //close
		System.out.println(imgAtt.getDistance_CSD("National Museum of Art of Romania", "2735205004.jpg", "3474967838.jpg")); //far
		System.out.println();
	}

}
