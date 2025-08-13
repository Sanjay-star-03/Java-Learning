public class MaxOfThree {
    public static void main(String[] args) {
        int a = 25, b = 42, c = 17;

        int max = Math.max(a, Math.max(b, c));
        System.out.println("Maximum is: " + max);
    }
}
