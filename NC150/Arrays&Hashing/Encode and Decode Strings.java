Date: 18.02.24
class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append("#").append(s);
        }
        return encoded.toString();
    }

    // Decodes a single string back to a list of strings.
    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // Find the '#' separator to extract the length
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length of the next word
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the word using the length
            String word = str.substring(j + 1, j + 1 + length);
            result.add(word);
            
            // Move to the next word
            i = j + 1 + length;
        }

        return result;
    }
}
