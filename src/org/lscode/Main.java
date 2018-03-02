package org.lscode;

public class Main {

    public static void main(String[] args) {
        int[] a1 = {0, 1, 3, -2, -2, 0, 1, 0, -3, -3, 2, 3};
        int[] a2 = {0, 1, 3, -2, 0, 1, 0, -3, 2, 3};
        int[] a3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] a4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a5 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] a6 = {1, 2, 3, 4, 5, 6, 4, 6};
        int[] a7 = {2, 1, 2, 3, 4, 5, 6, 7};

        System.out.println("============= Solution1 =============");
        Solution1 sol1 = new Solution1();
        System.out.println("Solution1 (1) ===>>> " + sol1.solution(a1));
        System.out.println("Solution1 (2) ===>>> " + sol1.solution(a2));
        System.out.println("Solution1 (3) ===>>> " + sol1.solution(a3));
        System.out.println("Solution1 (4) ===>>> " + sol1.solution(a4));
        System.out.println("Solution1 (5) ===>>> " + sol1.solution(a5));
        System.out.println("Solution1 (6) ===>>> " + sol1.solution(a6));
        System.out.println("Solution1 (7) ===>>> " + sol1.solution(a7));

        System.out.println("\n\n============= Solution2 =============");
        Solution2 sol2 = new Solution2();
        System.out.println("Solution2 (1) ===>>> " + sol2.solution(a1));
        System.out.println("Solution2 (2) ===>>> " + sol2.solution(a2));
        System.out.println("Solution2 (3) ===>>> " + sol2.solution(a3));
        System.out.println("Solution2 (4) ===>>> " + sol2.solution(a4));
        System.out.println("Solution2 (5) ===>>> " + sol2.solution(a5));
        System.out.println("Solution2 (6) ===>>> " + sol2.solution(a6));
        System.out.println("Solution2 (7) ===>>> " + sol2.solution(a7));

    }
}
