import java.io.File;
import java.util.ArrayList;

public class Modèle {
	ArrayList<ImageModèle> imagemodelelist;
	
	public Modèle() {
		// TODO Auto-generated constructor stub
		File folder = new File("images/");
		this.imagemodelelist = new ArrayList<>();
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
			  System.out.println(listOfFiles[i].getPath());
		    this.imagemodelelist.add(new ImageModèle(listOfFiles[i].getName(), listOfFiles[i].getAbsolutePath()));
		  } 
		}
	}
	public static void main(String[] args) {
		new Modèle();
	}
}
