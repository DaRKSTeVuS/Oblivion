package dominion.card.base;
import java.util.*;

import dominion.*;
import dominion.card.*;

/**
 * Carte Bibliothèque (Library)
 * 
 * Piochez jusqu'à ce que vous ayez 7 cartes en main. 
 * Chaque carte Action piochée peut être mise de côté. 
 * Défaussez les cartes mises de côté lorsque vous 
 * avez terminé de piocher.
 */
public class Library extends ActionCard {

	public Library(String name, int cost) {
		super(name, cost);
	}

	@Override
	public void play(Player p) {
		// TODO Auto-generated method stub
		p.incrementActions(-1);	// -1 Action pour l'utilisation de la carte
	}
}