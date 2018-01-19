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
public class AlejandroLago {

    public int blackjack(int a, int b) {
        int resultado = 0;

        if (a <= 21 && b <= 21) {

            if (a < b) {
                resultado = b;
            } else if (b < a) {
                resultado = a;

            } else {
                resultado = a;
            }

        }
        if (a > 21 && b > 21) {
            resultado = 0;
        }
        if (a <= 21 && b > 21) {
            resultado = a;

        }
        if (a > 21 && b <= 21) {
            resultado = b;
        }
        return resultado;

    }

}
