class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] c = new int[n];

        // Step 1: Give every child 1 candy
        for (int i = 0; i < n; i++) {
            c[i] = 1;
        }

        // Step 2: Left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                c[i] = c[i - 1] + 1;
            }
        }

        // Step 3: Right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                c[i] = Math.max(c[i], c[i + 1] + 1);
            }
        }

        // Step 4: Sum up candies
        int sum = 0;
        for (int candy : c) {
            sum += candy;
        }

        return sum;
    }
}