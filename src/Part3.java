public class Part3 {

    public static boolean twoOccurrences(String stringa, String stringb) {
        int firstOccurrence = stringa.indexOf(stringb);

        if (firstOccurrence != -1) {
            int secondOccurrence = stringa.indexOf(stringb, firstOccurrence + 1);
            if (secondOccurrence != -1) return true;
        }

        return false;
    }

    public static void testingOccurrences() {
        System.out.println("ATGATGAA");
        System.out.println(twoOccurrences("ATGATGAA", "ATG"));
        System.out.println("ATGATAAG");
        System.out.println(twoOccurrences("ATGATAAG", "ATG"));
    }

    public static String nextPart(String stringa, String stringb) {
        int firstOccurrence = stringb.indexOf(stringa);

        if (firstOccurrence != -1) return stringb.substring(firstOccurrence + stringa.length());

        return stringb;
    }

    public static void main(String[] args) {
        testingOccurrences();
        System.out.println(nextPart("br", "bruh"));
        System.out.println(nextPart("zoo", "forest"));
    }
}