package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Prêteur sur gages (Moneylender)
 * 
 * Écartez une carte Cuivre de votre main.
 * Dans ce cas, +3 Pièces.
 */
public class Moneylender extends ActionCard {

	public Moneylender(String name, int cost) {
		super(name, cost);
	}

	@Override
	public void play(Player p) {
		// TODO Auto-generated method stub
		p.incrementActions(-1);	// -1 Action pour l'utilisation de la carte
	}
}