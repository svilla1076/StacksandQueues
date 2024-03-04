public class DNAToRNA {

    public static String transcribeToRNA(String dnaSequence) {
        StringBuilder rnaSequence = new StringBuilder();
        for (char nucleotide : dnaSequence.toCharArray()) {
            switch (nucleotide) {
                case 'A':
                    rnaSequence.append('A');
                    break;
                case 'C':
                    rnaSequence.append('C');
                    break;
                case 'G':
                    rnaSequence.append('G');
                    break;
                case 'T':
                    rnaSequence.append('U'); // Replace 'T' with 'U'
                    break;
                default:
                    break;
            }
        }
        return rnaSequence.toString();
    }

    public static String translateToProtein(String rnaSequence) {
        StringBuilder proteinSequence = new StringBuilder();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, Math.min(i + 3, rnaSequence.length()));
            switch (codon) {
                case "UUU":
                case "UUC":
                    proteinSequence.append('F');
                    break;
                case "UUA":
                case "UUG":
                case "CUU":
                case "CUC":
                case "CUA":
                case "CUG":
                    proteinSequence.append('L');
                    break;
                case "AUU":
                case "AUC":
                case "AUA":
                    proteinSequence.append('I');
                    break;
                case "AUG":
                    proteinSequence.append('M');
                    break;
                case "GUU":
                case "GUC":
                case "GUA":
                case "GUG":
                    proteinSequence.append('V');
                    break;
                case "UCU":
                case "UCC":
                case "UCA":
                case "UCG":
                    proteinSequence.append('S');
                    break;
                case "CCU":
                case "CCC":
                case "CCA":
                case "CCG":
                    proteinSequence.append('P');
                    break;
                case "ACU":
                case "ACC":
                case "ACA":
                case "ACG":
                    proteinSequence.append('T');
                    break;
                case "GCU":
                case "GCC":
                case "GCA":
                case "GCG":
                    proteinSequence.append('A');
                    break;
                case "UAU":
                case "UAC":
                    proteinSequence.append('Y');
                    break;
                case "UAA":
                case "UAG":
                case "UGA":
                    proteinSequence.append('.');
                    break;
                case "CAU":
                case "CAC":
                    proteinSequence.append('H');
                    break;
                case "CAA":
                case "CAG":
                    proteinSequence.append('Q');
                    break;
                case "AAU":
                case "AAC":
                    proteinSequence.append('N');
                    break;
                case "AAA":
                case "AAG":
                    proteinSequence.append('K');
                    break;
                case "GAU":
                case "GAC":
                    proteinSequence.append('D');
                    break;
                case "GAA":
                case "GAG":
                    proteinSequence.append('E');
                    break;
                case "UGU":
                case "UGC":
                    proteinSequence.append('C');
                    break;
                case "UGG":
                    proteinSequence.append('W');
                    break;
                case "CGU":
                case "CGC":
                case "CGA":
                case "CGG":
                case "AGA":
                case "AGG":
                    proteinSequence.append('R');
                    break;
                case "AGU":
                case "AGC":
                    proteinSequence.append('S');
                    break;
                case "GGU":
                case "GGC":
                case "GGA":
                case "GGG":
                    proteinSequence.append('G');
                    break;
                default:
                    break;
            }
        }
        return proteinSequence.toString();
    }

    public static void main(String[] args) {
        // Sample inputs
        String[] dnaSequences = {
                "AGCTGGGAAACGTAGGCCTA",
                "TTTTTTTTTTGGCGCG",
                "CTTTGGGACTAGTAACCCATTTCGGCT"
        };

        // turn each DNA sequence to RNA, translate to protein, and print the result
        for (String dnaSequence : dnaSequences) {
            String rnaSequence = transcribeToRNA(dnaSequence);
            String proteinSequence = translateToProtein(rnaSequence);
            System.out.println(proteinSequence);
        }
    }
}
