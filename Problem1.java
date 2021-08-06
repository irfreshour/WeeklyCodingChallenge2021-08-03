// Problem 1:
// Given two Strings A and B. Find the length of the Longest Common Subsequence (LCS) of the given Strings.
// Input: A = Minneapolis, B = Minnesota.

public class Problem1 {

    public static void main(String[] args) {
        Problem1 lcs = new Problem1();
        String string1 = "Minneapolis";
        String string2 = "Minnesota";

        char[] A = string1.toCharArray();
        char[] B = string2.toCharArray();
        int r = A.length;
        int c = B.length;

        System.out.println(lcs.lcs(A, B, r, c));
    }

    int lcs(char[] A, char[] B, int r, int c) {
        if (r == 0 || c == 0) {
            return 0;
        }
        if (A[r - 1] == B[c - 1]) {
            return 1 + lcs(A, B, r - 1, c - 1);
        } else {
            return Math.max(lcs(A, B, r, c - 1), lcs(A, B, r - 1, c));
        }
    }
}
