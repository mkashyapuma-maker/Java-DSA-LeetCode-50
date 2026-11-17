class Solution {
    public double average(int[] salary) {
        int minimum = Integer.MAX_VALUE, maximum = Integer.MIN_VALUE;
        int sum = 0;
        for (int value : salary) {
            sum += value;
            minimum = Math.min(minimum, value);
            maximum = Math.max(maximum, value);
        }
        return (double) (sum - minimum - maximum) / (salary.length - 2);
    }
}
