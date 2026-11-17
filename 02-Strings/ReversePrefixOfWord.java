class Solution {
    public String reversePrefix(String word, char ch) {
        int end = word.indexOf(ch);
        if (end == -1) return word;
        char[] chars = word.toCharArray();
        int left = 0, right = end;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        return new String(chars);
    }
}
