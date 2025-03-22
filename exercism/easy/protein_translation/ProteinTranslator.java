package easy.protein_translation;

// Link: https://exercism.org/tracks/java/exercises/protein-translation

import java.util.*;

public class ProteinTranslator {

    private static final Map<String, String> RNA_TO_PROTEIN = new HashMap<>();

    static {
        RNA_TO_PROTEIN.put("AUG", "Methionine");
        RNA_TO_PROTEIN.put("UUU", "Phenylalanine");
        RNA_TO_PROTEIN.put("UUC", "Phenylalanine");
        RNA_TO_PROTEIN.put("UUA", "Leucine");
        RNA_TO_PROTEIN.put("UUG", "Leucine");
        RNA_TO_PROTEIN.put("UCU", "Serine");
        RNA_TO_PROTEIN.put("UCC", "Serine");
        RNA_TO_PROTEIN.put("UCA", "Serine");
        RNA_TO_PROTEIN.put("UCG", "Serine");
        RNA_TO_PROTEIN.put("UAU", "Tyrosine");
        RNA_TO_PROTEIN.put("UAC", "Tyrosine");
        RNA_TO_PROTEIN.put("UGU", "Cysteine");
        RNA_TO_PROTEIN.put("UGC", "Cysteine");
        RNA_TO_PROTEIN.put("UGG", "Tryptophan");
        RNA_TO_PROTEIN.put("UAA", "STOP");
        RNA_TO_PROTEIN.put("UAG", "STOP");
        RNA_TO_PROTEIN.put("UGA", "STOP");
    }

    List<String> translate(String rnaSequence) {
        List<String> proteinsSequence = new ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            if(i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("Invalid codon");
            }
            String codon = rnaSequence.substring(i, i + 3);
            String protein = RNA_TO_PROTEIN.get(codon);
            if (protein == null) {
                throw new IllegalArgumentException("Invalid codon");
            }
            if ("STOP".equals(protein)) {
                break;
            }
            proteinsSequence.add(protein);
        }
        return proteinsSequence;
    }
}
