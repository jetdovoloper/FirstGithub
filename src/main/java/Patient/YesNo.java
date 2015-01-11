/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Patient;

/**
 *
 * @author jetDo
 */
public enum YesNo {
    YES(1), NO(0);
    
    private int score;

    private YesNo(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
           
}
