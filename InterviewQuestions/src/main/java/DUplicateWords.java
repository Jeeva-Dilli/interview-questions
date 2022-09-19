
import java.util.HashMap;

public class DUplicateWords {
    public static void main(String[] args) {

        String s = "how old are are how you how";
        System.out.println(getCount(s));
    }

    public static HashMap<String,Integer> getCount(String str)
    {
        HashMap<String,Integer> occurrences = new HashMap<>();
        String[] splitWords = str.split(" ");
        for ( String word : splitWords ) {
            Integer oldCount = occurrences.get(word);
            if ( oldCount == null ) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
        return occurrences;
    }
}
