class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int n = word1.length(), m = word2.length();
        
        // merge letters alternately
        while (i < n && j < m) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        // append remaining characters
        if (i < n) sb.append(word1.substring(i));
        if (j < m) sb.append(word2.substring(j));

        return sb.toString();
    }
}
