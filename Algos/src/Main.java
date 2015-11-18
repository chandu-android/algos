import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

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
            } else if (sample.get(i) == sample.get(i+1)){
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
