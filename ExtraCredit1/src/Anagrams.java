import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] words = {"listen", "silent", "hello", "world", "earth", "heart"};
        sortAnagrams(words);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }

    public static void sortAnagrams(String[] words) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(word);
        }

        int index = 0;
        for (List<String> list : map.values()) {
            for (String word : list) {
                words[index++] = word;
            }
        }
    }
}
//Time Complexity: O(n log n)
//Space Complexity O(n log n)
