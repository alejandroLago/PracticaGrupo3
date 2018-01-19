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
public class Diego {
    public boolean makeBricks(int small, int big, int goal) {
  int maxBig = goal/5;
	if(maxBig <= big)
		goal -= maxBig*5;
	else
		goal -= big*5;
	if(goal <= small)
		return true;
	return false;
	
                
    
    }
}
