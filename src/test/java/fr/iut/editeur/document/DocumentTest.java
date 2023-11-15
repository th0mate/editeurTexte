package fr.iut.editeur.document;

import junit.framework.TestCase;
import org.junit.Test;

public class DocumentTest extends TestCase {

    @Test
    public void testDocument() {
        Document document = new Document();
        //faire un test automatique qui passe ou ne passe pas
        document.clear();
        document.ajouter("Bonjour");
        //on vérifie que le document contient bien "Bonjour"
        if (!document.getTexte().equals("Bonjour")) {
            throw new RuntimeException("Le document ne contient pas le texte attendu");
        }
    }





}
