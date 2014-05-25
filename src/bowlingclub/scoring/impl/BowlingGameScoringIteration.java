package bowlingclub.scoring.impl;

import bowlingclub.BowlingGameConfig;
import bowlingclub.scoring.BowlingGameScoringState;

/**
 * Bowling game scoring iteration for use with rule and processor.
 *
 * It is a context Data transfer object encapsulating number of pins, scoring state and configuration.
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameScoringIteration {

    private int noOfPins = 0;

    private BowlingGameScoringState state;

    private final BowlingGameConfig config;

    public BowlingGameScoringIteration(BowlingGameScoringState state, BowlingGameConfig config, int noOfPins) {
        this.state = state;
        this.config = config;
        this.noOfPins = noOfPins;
    }

    public BowlingGameScoringState getState() {
        return state;
    }

    public int getNoOfPins() {
        return noOfPins;
    }

    public BowlingGameConfig getConfig() {
        return config;
    }
}
