public class FootballHeights {
    public static void main(String[] args) {
        int[] h = new int[11];
        int sum = 0, min = 250, max = 150;

        for (int i = 0; i < 11; i++) {
            h[i] = 150 + (int)(Math.random() * 101);
            sum += h[i];
            if (h[i] < min) min = h[i];
            if (h[i] > max) max = h[i];
        }

        System.out.println("Heights:");
        for (int x : h) System.out.print(x + " ");

        System.out.println("\nMean: " + (sum / 11.0));
        System.out.println("Shortest: " + min);
        System.out.println("Tallest: " + max);
    }
}
