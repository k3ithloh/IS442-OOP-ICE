import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MatrixRepresentation {
    public static int countFriends(int[][] ary, String[] names, String target) {
        List<String> list = Arrays.asList(names);
        int targetIndex = list.indexOf(target);
        int count = 0;
        for (int i = 0; i < ary[targetIndex].length; i++) {
            if (ary[targetIndex][i] == 1) {
                count++;
            }
        }

        return count;
    }

    public static String[] commonFriends(int[][] ary, String[] names, String friend1, String friend2) {
        List<String> list = Arrays.asList(names);
        int friend1Index = list.indexOf(friend1);
        int friend2Index = list.indexOf(friend2);

        List<String> commonFriends = new ArrayList<>();

        for (int i = 0; i < ary[friend1Index].length; i++) {
            if (ary[friend1Index][i] == 1) {
                if (ary[friend2Index][i] == 1) {
                    commonFriends.add(list.get(i));
                }
            }
        }

        return commonFriends.toArray(new String[commonFriends.size()]);
    }

    public static Map<Integer, List<String>> getSociableStats(int[][] ary, String[] names) {
        Map<Integer, List<String>> socialableStats = new HashMap<>();

        for (int j = 0; j < ary.length; j++) {
            int count = 0;

            for (int k = 0; k < ary[j].length; k++) {
                if (ary[j][k] == 1) {
                    count++;
                }
            }
            if (socialableStats.containsKey(count)) {
                socialableStats.get(count).add(names[j]);
            } else {
                List<String> list = new ArrayList<>();
                list.add(names[j]);
                socialableStats.put(count, list);
            }
        }
        return socialableStats;
    }

}
