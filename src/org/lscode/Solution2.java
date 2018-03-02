package org.lscode;

public class Solution2 {
    //[0, 1, 2,  3, 4, 5, 6,  7, 8, 9]
    //[0, 1, 3, -2, 0, 1, 0, -3, 2, 3]
    //            0,1,2,3,4,5,6,7
    //int[] a6 = {1,2,3,4,5,6,4,6}
    public int solution(int[] A) {
        int p = 0;
        int q = 0;
        int r = 0;
        int depth = 0;
        int maxdepth = 0;
        int len = A.length;
        int ptr = 1;

        //System.out.println("len= " + len);
        while (ptr <len-1){
            p = 0;
            q = 0;
            r = 0;
            while ((A[ptr] >= A[ptr-1]) && (ptr <len-1)){
                ptr++;
            }
            //System.out.println("!1   ptr= " + ptr);
            if (ptr == len-1) break;

            p = ptr-1;

            //System.out.println(">> set! p= " + p);

            while ((A[ptr] < A[ptr-1]) && (ptr <len-1)){
                ptr++;
            }
            //System.out.println("!2   ptr= " + ptr);

            //if (ptr == len-1) break;
            q = ptr-1;
            //System.out.println(">> set! q= " + q);

            while ((A[ptr] > A[ptr-1]) && (ptr <len-1)){
                ptr++;
            }
            //System.out.println("!3   ptr= " + ptr);
            r = (ptr == len-1) ? ptr : ptr-1;
            //System.out.println(">> set! r= " + r);
            //System.out.println("pitDepth: " + p + "; " + q + "; " + r);
            //System.out.println("          " + A[p] + "; " + A[q] + "; " + A[r]);

            depth = A[p] - A[q] < A[r] - A[q] ? A[p] - A[q] : A[r] - A[q];
            //System.out.println("depth = " + depth);
            maxdepth = maxdepth < depth ? depth : maxdepth;
        }
        return (maxdepth == 0) ? -1 : maxdepth;
    }
}
