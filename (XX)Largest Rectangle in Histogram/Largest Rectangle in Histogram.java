class Solution {
    public int largestRectangleArea(int[] heights) {
        if (heights == null || heights.length == 0) {
            return 0;
        }

        int[] left = new int[heights.length];
        int[] result = new int[heights.length];

        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < heights.length; i++) {
            if (stack.empty()) {
                left[i] = 0;
                stack.push(i);
            } else if (heights[stack.peek()] < heights[i]) {
                left[i] = i;
                stack.push(i);
            } else if (heights[stack.peek()] == heights[i]) {
                left[i] = left[stack.peek()];
                stack.push(i);
            } else {
                while (!stack.empty() && heights[stack.peek()] > heights[i]) {
                    left[i] = left[stack.peek()];
                    result[stack.peek()] = (i - left[stack.peek()]) * heights[stack.peek()];
                    stack.pop();
                }
                if (!stack.empty() && heights[stack.peek()] == heights[i]) {
                    left[i] = left[stack.peek()];
                    stack.push(i);
                } else {
                    stack.push(i);
                }
            }
        }

        while (!stack.empty()) {
            result[stack.peek()] = (heights.length - left[stack.peek()]) * heights[stack.peek()];
            stack.pop();
        }

        int max = result[0];
        for (int i = 1; i < result.length; i++) {
            max = Math.max(max, result[i]);
        }

        return max;
    }
}