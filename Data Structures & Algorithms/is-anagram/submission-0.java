class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            count.put(a, count.getOrDefault(a, 0) + 1);
            count.put(b, count.getOrDefault(b, 0) - 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (count.get(c) != 0) {
                return false;
            }
        }

        return true;
    }
}
