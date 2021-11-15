package de.unistuttgart.iste.sqa.pse.sheet05.controlflowexercise;

import de.hamstersimulator.objectsfirst.datatypes.Direction;
import de.hamstersimulator.objectsfirst.datatypes.Location;
import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * A new HamsterGame to try out some control flow structures.
 *
 * @author (your name)
 * @version (version number or date)
 */
public abstract class BaseControlFlowHamsterGame extends SimpleHamsterGame {

    protected final String territoryFile;

    /**
     * Constructor for the BaseControlFlowHamsterGame class
     *
     * @param territoryFile file-path to the .ter file specifying the game territory
     */
    public BaseControlFlowHamsterGame(String territoryFile) {
        this.territoryFile = territoryFile;
    }

    /**
     * Starts the game with a predetermined territory.
     */
    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile(territoryFile);
        this.displayInNewGameWindow();
        game.startGame();
    }

    /*
     * Please implement your solutions for exercise 2 into the following methods.
     * Remember to add the appropriate JavaDoc documentation and pre-post conditions for each operation
     * as well as the variants and loop invariants for any loops that are part of your implementation.
     */

    protected void pickGrainIfAvailable() {
        //TODO: Please implement according to exercise 2(b)
    }

    protected void pickAllGrains() {
        //TODO: Please implement according to exercise 2(c)
    }

    protected void multiMove(Integer times) {
        //TODO: Please implement according to exercise 2(d)
    }

    protected void pickGrainOrMove() {
        //TODO: Please implement according to exercise 2(e)
    }

    protected void pickAllGrainsOnNonEmptyTile() {
        //TODO: Please implement according to exercise 2(f)
    }

    protected void cleanTerritory() {
        //TODO: Please implement according to exercise 2(i)/(k)
    }

    protected void putGrains(Integer amountOfGrains) {
        //TODO: Please implement according to exercise 2(j)
    }

    protected void emptyMouth() {
        //TODO: Please implement according to exercise 2(j)
    }
}