public class Part2 {

    public static String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String gene = "DNA not found";

        String upperDna = dna.toUpperCase();

        int start = upperDna.indexOf(startCodon);
        if (start != -1) {
            int end = upperDna.indexOf(stopCodon);

            if (end != -1) {
                if ((end - start) % 3 == 0) {
                    gene = dna.substring(start, end + 3);
                    
                    return gene;
                }
            }
        }

        return gene;
    }

    public static void testSimpleGene() {
        String one = "atgaagtaa";
        System.out.println(one);
        System.out.println(findSimpleGene(one, "ATG", "TAA"));
        String two = "AATTAA";
        System.out.println(two);
        System.out.println(findSimpleGene(two, "ATG", "TAA"));
        String three = "atgata";
        System.out.println(three);
        System.out.println(findSimpleGene(three, "ATG", "TAA"));
        String four = "AATTTA";
        System.out.println(four);
        System.out.println(findSimpleGene(four, "ATG", "TAA"));
        String five = "ATGTATAA";
        System.out.println(five);
        System.out.println(findSimpleGene(five, "ATG", "TAA"));
    }

    public static void main(String[] args) throws Exception {
        testSimpleGene();
    }
}
