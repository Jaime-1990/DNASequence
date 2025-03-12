import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DNA dna1 = new DNA("ATGCGATACGCTTGA");
        DNA dna2 = new DNA("ATGCGAATACGTGA");
        DNA dna3 = new DNA("ATTAATATGTACTGA");
        DNA dna4 = new DNA("TTAAATGTGCTGTTGA");
        DNA dna5 = new DNA("ATGTTAGGCGTA");

        ArrayList<DNA> dnaArrayList = new ArrayList<>();
        dnaArrayList.add(dna1);
        dnaArrayList.add(dna2);
        dnaArrayList.add(dna3);
        dnaArrayList.add(dna4);
        dnaArrayList.add(dna5);

        for (DNA currentDNA : dnaArrayList) {
            System.out.println("DNA Sequence: " + currentDNA.dna + " --> Protein: " + currentDNA.protein);
        }
    }
}
