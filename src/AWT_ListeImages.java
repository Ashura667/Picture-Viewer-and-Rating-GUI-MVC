import java.awt.List;
import java.awt.Panel;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Observable;
import java.util.Observer;

public class AWT_ListeImages extends Panel implements Observer {
	
	//TODO : idéalement, les noms des images devraient provenir du modèle
	public static String[] images = {"bretagne", "cellules", "espace", "gaudi", "paris"};
	List listeImages;

	public AWT_ListeImages(ItemListener l, Modèle d) {
		
		this.listeImages = new List(20);
		this.listeImages.setName("sélectionImages");
		for (int i=0; i<images.length; i++) {
			this.listeImages.add(AWT_ListeImages.images[i]);
		}
		this.add(listeImages);
		this.listeImages.addItemListener(l);
		d.addObserver(this);

	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		int i = this.listeImages.getSelectedIndex();
		this.listeImages.replaceItem(arg.toString(), i);
		this.listeImages.select(i);
		
	}
}
