import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestionImages extends Frame implements WindowListener, ItemListener {

	public static void main(String[] args) {
		new GestionImages();
	}

	public GestionImages() {

		this.setLayout(new BorderLayout());
		Modèle modl = new Modèle();
		Contrôleur ctrl = new Contrôleur(modl);

		AWT_ListeImages panneauGauche = new AWT_ListeImages(ctrl,modl);
		this.add(panneauGauche, BorderLayout.WEST);

		AWT_AfficheurImage panneauDroite = new AWT_AfficheurImage(modl);
		this.add(panneauDroite, BorderLayout.EAST);

		AWT_NoteImage panneauBas = new AWT_NoteImage(this);
		this.add(panneauBas, BorderLayout.SOUTH);

		this.addWindowListener(this);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { 
		System.exit(0); 
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() instanceof Checkbox) {
			System.out.println("Nouvelle note : "+e.getItem());	
		} else if (e.getSource() instanceof List) {
			Integer n = (Integer)e.getItem();
			System.out.println("Nouvelle image séléctionnée : "+AWT_ListeImages.images[n]);
		}
	}

}
