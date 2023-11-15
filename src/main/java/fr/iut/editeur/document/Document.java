package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    /**
     * Remplace le texte entre start et end par remplacement
     * @param start
     * @param end
     * @param remplacement
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    /**
     * Met en majuscule le texte entre start et end
     * @param start
     * @param end
     */
    public void majuscules(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String aRemplacer = texte.substring(start, end);
        texte = leftPart + aRemplacer.toUpperCase() + rightPart;
    }

    /**
     * Supprime le texte entre start et end
     * @param start
     * @param end
     */
    public void suppression(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + rightPart;
    }

    /**
     * Supprime tout le texte
     */
    public void clear() {
        texte = "";
    }

    /**
     * Insère le texte insertion à la position start
     * @param start
     * @param insertion
     */
    public void inserer(int start, String insertion) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(start);
        texte = leftPart + insertion + rightPart;
    }

}