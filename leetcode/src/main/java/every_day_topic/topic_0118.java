package every_day_topic;

import java.util.ArrayList;
import java.util.List;

public class topic_0118 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> layout0 = new ArrayList<>();
        layout0.add(1);
        result.add(layout0);

        for (int index = 1; index < numRows; index++) {

            ArrayList<Integer> layout = new ArrayList<>();

            for (int col = 0; col < index + 1; col++) {
                if (col == 0 || col == index) {
                    layout.add(1);
                } else {
                    layout.add(result.get(index - 1).get(col - 1) + result.get(index - 1).get(col));
                }
            }
            result.add(layout);
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(generate(10));
    }

}
