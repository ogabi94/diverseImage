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

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModulText m=new ModulText("Admiralty Arch London");
                ArrayList<Cluster> clusters=new ArrayList();
                clusters=m.getImages();
	}

}
