public class DNA {


    public String dna;
    public String protein;

    public DNA(String sequence) {
        dna = sequence;
        protein = proteinSequence();
    }

    public boolean hasProtein() {
        int startCodonIndex = dna.indexOf("ATG");
        int endCodonIndex = dna.indexOf("TGA");

        return startCodonIndex != -1 && endCodonIndex != -1 && (endCodonIndex - startCodonIndex + 3) % 3 == 0;
    }

    public String proteinSequence() {
        if (hasProtein()) {
            protein = dna.substring(dna.indexOf("ATG") + 3, dna.indexOf("TGA"));
        } else {
            protein = "No protein";
        }
        return protein;
    }
}
