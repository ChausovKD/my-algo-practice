package easy.rna_transcription;

// Link: https://exercism.org/tracks/java/exercises/rna-transcription

public class RnaTranscription {

    String transcribe(String dnaStrand) {
        StringBuilder stringBuilder = new StringBuilder(dnaStrand);
        for (int i = 0; i < dnaStrand.length(); i++) {
            switch (dnaStrand.charAt(i)) {
                case 'G' -> {
                    stringBuilder.setCharAt(i, 'C');
                }
                case 'C' -> {
                    stringBuilder.setCharAt(i, 'G');
                }
                case 'T' -> {
                    stringBuilder.setCharAt(i, 'A');
                }
                case 'A' -> {
                    stringBuilder.setCharAt(i, 'U');
                }
            }
        }
        return stringBuilder.toString();
    }
}
