import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Contrôleur implements ItemListener{
	Modèle modèle;
	public Contrôleur(Modèle m) {
		// TODO Auto-generated constructor stub
		this.modèle =m;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof java.awt.List) {
			this.modèle.sélection((Integer)e.getItem());	
		} 
	}

}
