class PalindromeChecker {
    String text;

    PalindromeChecker(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equals(rev);
    }

    void display() {
        System.out.println(isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.display();
    }
}
