import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindDuplicateAndMissing {

//    You are given a read only array of n integers from 1 to n.
//    Each integer appears exactly once except A which appears twice and B which is missing.
//    Return A and B.
//    Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//    Note that in your output A should precede B.

//    Example:
//    Input:[3 1 2 5 3]
//    Output:[3, 4]
//    A = 3, B = 4

    public static void main(String[] args) {
        ArrayList<Integer> sampleArrayData = repeatedNumber(new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(5);
            add(3);
            add(3);
        }});
        System.out.println(sampleArrayData);
    }

    private static ArrayList<Integer> repeatedNumber(final List<Integer> sample) {
        Collections.sort(sample);
        ArrayList<Integer> result = new ArrayList<>();
        int missing = 0;
        int duplicate = 0;
        if (sample != null && sample.get(0) !=1) {
            missing = 1;
        }
        for (int i=0; i<sample.size()-1; i++) {
            if ((sample.get(i)+1) == sample.get(i + 1)) {
                continue;
            } else if (sample.get(i).equals(sample.get(i+1))){
                duplicate = sample.get(i);
            } else {
                missing = sample.get(i)+1;
            }
        }
        if (missing !=0 && duplicate != 0) {
            result.add(duplicate);
            result.add(missing);
        }
        return result;
    }
}
