package dominion.card;
import java.util.*;

import dominion.*;

/**
 * Les cartes Victoire
 */
public abstract class VictoryCard extends Card {
	public VictoryCard(String name, int cost) {
		super(name, cost);		// utilisation du constructeur de Card
	}
	
	@Override
	public List<CardType> getTypes() {
		List<CardType> types = super.getTypes();// on récupère la liste des types(vide) de Card dans une nouvelle liste
		types.add(CardType.Victory);			// on ajoute le type Victory à cette liste
		return types;							//on retourne cette liste
	}
	
}