public class Part5 {

    public static String findGeneWhile(String dna, String startCodon, String endCodon) {
        String gene = "Gene not found";
        int startIndex = dna.indexOf(startCodon);

        if (startIndex != -1) {

            int currentEnd = dna.indexOf(endCodon);

            while (currentEnd != -1) {
                if ((currentEnd - startIndex) % 3 == 0) {
                    gene = dna.substring(startIndex, currentEnd + 3);
                    currentEnd = dna.indexOf(endCodon, currentEnd + 3);
                }
            }
        }

        return gene;
    }

    public static void test() {
        System.out.println("ATGTAA");
        System.out.println(findGeneWhile("ATGTAA", "ATG", "TAA"));

        System.out.println("TAA");
        System.out.println(findGeneWhile("TAA", "ATG", "TAA"));

        System.out.println("ATGAATTAAAATTAA");
        System.out.println(findGeneWhile("ATGAATTAAAATTAA", "ATG", "TAA"));
    }
    public static void main(String[] args) {
        test();
    }
    
}