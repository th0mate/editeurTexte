package fr.iut.editeur.commande.factory;

import fr.iut.editeur.commande.*;
import fr.iut.editeur.commande.invoker.CommandeRemplacer;
import fr.iut.editeur.document.Document;

public class CommandeFactory {

    private static CommandeFactory instance;

    public static CommandeFactory getInstance() {
        if(instance == null) {
            instance = new CommandeFactory();
        }
        return instance;
    }

    private CommandeFactory() {}

    public Commande createCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "ajouter" : return new CommandeAjouter(document, parameters);
            default: return null;
        }
    }

    public Commande replaceCommand(String name, Document document, String[] parameters) {
        switch (name) {
            case "remplacer" : return new CommandeRemplacer(document, parameters);
            default: return null;
        }
    }

}
