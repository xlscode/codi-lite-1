package org.lscode;

import java.util.Arrays;

public class Solution1 {
    private int cp = 0;
    private int cq = 0;
    private int cr = 0;
    private int cd = 0;
    private int md = 0;

    private boolean pit = false;

    public int solution(int[] A) {
        //System.out.println(Arrays.toString(A));
        int r;
        int l;

        int len = A.length;
        //System.out.println("len = " + len);

        if (len < 3) return -1;

        //[0, 1, 2,  3, 4, 5, 6,  7, 8, 9]
        //[0, 1, 3, -2, 0, 1, 0, -3, 2, 3]

        for (int i=1; i < len; i++){
            r = i;
            l = r - 1;

            //System.out.println("r = " + r);
            //System.out.println("*" + A[r] + "; " + A[l]);
            if (A[r] < A[l]){
                if (cp == 0) {
                    cp = l;
                    //System.out.println("!_1__cp= " + l);
                }
                else if (cq != 0){
                    cr = l;
                    //System.out.println("!_2__cr= " + l);
                    cd = pitDepth(A, cp, cq, cr);
                    if (cd > md){
                        md = cd;
                        resetPit();
                        cp = l;
                    }
                }
            }
            else if (A[r] > A[l]){
                if (cp !=0 && cq == 0) {
                    cq = l;
                    //System.out.println("!_3__cq= " + l);
                    pit = true;
                    //System.out.println("pit has been set");
                    cr = r;
                    //System.out.println("!_4__cr= " + r);
                    if (r == len - 1){
                        //System.out.println("end of array");
                        cd = pitDepth(A, cp, cq, cr);
                        if (cd > md){
                            md = cd;
                            resetPit();
                        }
                    }
                }
                else if (cp != 0 && cq != 0) {
                    cr = r;
                    //System.out.println("!_5__cr= " + r);
                    if (r == len - 1){
                        //System.out.println("end of array");
                        cd = pitDepth(A, cp, cq, cr);
                        if (cd > md){
                            md = cd;
                            resetPit();
                        }
                    }
                }
            }
            else{
                if (pit){
                    cd = pitDepth(A, cp, cq, cr);
                    if (cd > md){
                        md = cd;
                        resetPit();
                    }
                }
                else {
                    resetPit();
                }
            }

        }
        if (md > 0) return md;
        else return -1;

    }

    private int pitDepth(int[] A, int p, int q, int r){
        //System.out.println("pitDepth: " + p + "; " + q + "; " + r);
        //System.out.println("          " + A[p] + "; " + A[q] + "; " + A[r]);
        int decr = A[p] - A[q];
        int incr = A[r] - A[q];

        //System.out.println(decr + "; " + incr);

//        if (incr < decr) System.out.println(" --> " + incr);
//        else  System.out.println(" --> " + decr);

        if (incr < decr) return incr;
        else return decr;
    }

    private void resetPit(){
        cp = 0;
        cq = 0;
        cr = 0;
        pit = false;
        //System.out.println("pit has been RESET!");
    }

}
