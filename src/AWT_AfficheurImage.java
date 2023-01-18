import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;

public class AWT_AfficheurImage extends Canvas implements Observer {

	String imageDefault = "images/paris.jpg";
	
	Image img = null;

	public AWT_AfficheurImage(Modèle modèle ) {
		super();
		this.setPreferredSize(new Dimension(640,360));
		String imgDefaut = modèle.imagemodelelist.get(0).pathofimage;

		try {
			img = ImageIO.read(new File(imageDefault));
		} catch (IOException e) {
			throw new RuntimeException("L'image "+imageDefault+" est introuvable");
		}
		modèle.addObserver(this);

	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		ImageModèle im = (ImageModèle)arg;
		try {
			img = ImageIO.read(new File(imageDefault));
			repaint();
		} catch (IOException e) {
			throw new RuntimeException("L'image "+imageDefault+" est introuvable");
		}

		
	}

}
