class Solution {
    public int mostWordsFound(String[] sentences) {
        int maximum = 0;
        for (String sentence : sentences) {
            maximum = Math.max(maximum, sentence.split(" ").length);
        }
        return maximum;
    }
}
