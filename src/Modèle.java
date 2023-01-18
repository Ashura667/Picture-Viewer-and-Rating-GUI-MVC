import java.io.File;
import java.util.ArrayList;
import java.util.Observable;

public class Modèle  extends Observable{
	ArrayList<ImageModèle> imagemodelelist;
	Integer imageSelectionne;
	
	public Modèle() {
		// TODO Auto-generated constructor stub
		File folder = new File("images/");
		this.imagemodelelist = new ArrayList<>();
		File[] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    this.imagemodelelist.add(new ImageModèle(listOfFiles[i].getName()
		    		, listOfFiles[i].getPath()));
		  } 
		}
	}
	public static void main(String[] args) {
		new Modèle();
	}
}
