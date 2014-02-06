package edu.macalester.comp124.life;

/**
 * RuleSet implementing HighLife Rules.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */
public class HighLife implements RuleSet {

    public String getName() {
        return "HighLife";
    }



    /**
     * Applies the rules of HighLife.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {


        // If statement one: applies to cells for which isAlive is true:
        if(isAlive) {
            // Kills lonely cells
            if (neighborCount < 2){
                isAlive = false;
            }
            //Kills overcrowded cells
            if (neighborCount>3) {
                isAlive = false;

            }
        }
        // Births new cells
        else {
            if (neighborCount == 3) {
                isAlive = true;
            }
            if (neighborCount == 6) {
                isAlive = true;
            }
            // Otherwise, isAlive is passed through
        }
        return isAlive;
    }
}





















