class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // If concatenating in both orders isn't equal, there is no GCD string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Find GCD of the lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return substring up to gcdLength
        return str1.substring(0, gcdLength);
    }

    // Helper function to compute GCD of two integers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
