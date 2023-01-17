import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class AWT_ListeImages extends Panel {
	
	//TODO : idéalement, les noms des images devraient provenir du modèle
	public static String[] images = {"bretagne", "cellules", "espace", "gaudi", "paris"};
	
	public AWT_ListeImages(ItemListener l) {
		
		List listeImages = new List(20);
		listeImages.setName("sélectionImages");
		for (int i=0; i<images.length; i++) {
			listeImages.add(AWT_ListeImages.images[i]);
		}
		this.add(listeImages);
		listeImages.addItemListener(l);
	}
}
