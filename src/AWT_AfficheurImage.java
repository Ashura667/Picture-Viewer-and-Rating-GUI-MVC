import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.imageio.ImageIO;

public class AWT_AfficheurImage extends Canvas {

	String imageDefault = "images/paris.jpg";
	
	Image img = null;

	public AWT_AfficheurImage() {
		super();
		this.setPreferredSize(new Dimension(640,360));
		
		try {
			img = ImageIO.read(new File(imageDefault));
		} catch (IOException e) {
			throw new RuntimeException("L'image "+imageDefault+" est introuvable");
		}
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), null);
	}

}
