import java.util.HashMap;
import java.util.Map;

public class winner_of_elective {

    public static String[] winner(String arr[], int n) {

        Map<String, Integer> mapNameToVote = new HashMap<>();
        int maxVote = 0;

        for (int i = 0; i < n; i++) {
            mapNameToVote.put(arr[i], mapNameToVote.getOrDefault(arr[i], 0) + 1);
            maxVote = Math.max(maxVote, mapNameToVote.get(arr[i]));
        }

        String name = "";

        for (Map.Entry<String, Integer> entry : mapNameToVote.entrySet()) {
            if (entry.getValue() == maxVote) {
                if (name.equals("") || entry.getKey().compareTo(name) < 0) {
                    name = entry.getKey();
                }
            }
        }

        String vote = String.valueOf(maxVote);
        String[] result = { name, vote };
        return result;
    }
}
