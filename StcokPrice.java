public class StcokPrice {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 10};
        best(a);
    }

    public static int best(int[] input) {
        int min = input[0];
        int pro = 0;
        for (int i = 1; i < input.length; i++) {
            int cost = input[i] - min;
            pro = Math.max(cost, pro);
            min = Math.min(input[i], min);
        }
        System.out.println(pro);
        return pro;
    }
}
