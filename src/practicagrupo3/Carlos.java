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
public class Carlos {

    public int luckySum(int a, int b, int c) {

        if (a == 13) {
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }

    }

}
