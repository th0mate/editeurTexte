package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.Commande;
import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class CommandeClear extends CommandeDocument {
    public CommandeClear(Document document, String[] parameters) {
        super(document, parameters);
    }

    /**
     * Efface le document
     */
    @Override
    public void executer() {
        this.document.clear();
        super.executer();
    }
}
