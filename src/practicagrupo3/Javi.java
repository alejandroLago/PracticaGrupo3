/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagrupo3;

/**
 *
 * @author xp
 */
public class Javi {

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a == c) {
            return b;
        } else {
            return a + b + c;
        }
    }
}
