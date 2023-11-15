package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    /**
     * Constructeur
     * @param document
     * @param parameters
     */
    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
    }


    /**
     * Affiche le document
     */
    @Override
    public void executer() {
        System.out.println(this.document);
    }
}
