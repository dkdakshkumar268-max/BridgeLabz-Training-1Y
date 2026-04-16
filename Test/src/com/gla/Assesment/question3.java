public class question3 {
    public static void main(String[] args) {
        int num = 102030;

        String result = String.valueOf(num).replace('0', '1');

        int finalNum = Integer.parseInt(result);
        System.out.println(finalNum);
    }
}