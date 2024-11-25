public class ContinerWithMostOfwater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        //System.out.println(maxArea(height));
        System.out.println(maxAreaOptimizedSolution(height));
    }
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int length = Math.min(height[i], height[j]);
                int breadth = j - i;
                int tempArea = length * breadth;
                if (tempArea > maxArea) {
                    maxArea = tempArea;
                }
            }
        }
        return maxArea;
    }

    public static int maxAreaOptimizedSolution(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {

            int length = Math.min(height[i], height[j]);
            int breadth = j - i;
            int tempArea = length * breadth;
            if (tempArea > maxArea) {
                maxArea = tempArea;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
