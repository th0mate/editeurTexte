package fr.iut.editeur.commande.invoker;

import fr.iut.editeur.commande.CommandeDocument;
import fr.iut.editeur.document.Document;

public class commandeSupprimer extends CommandeDocument {

    public commandeSupprimer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if(parameters.length < 2) {
            System.err.println("Format attendu : effacer;start;end");
            return;
        }

        this.document.suppression(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]));
        super.executer();
    }


}
