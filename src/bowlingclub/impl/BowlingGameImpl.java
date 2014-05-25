package bowlingclub.impl;

import bowlingclub.BowlingGame;
import bowlingclub.BowlingGameConfig;
import bowlingclub.scoring.BowlingGameScoringProcessor;
import bowlingclub.scoring.BowlingGameScoringState;

/**
 * Bowling Game Implementation class
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameImpl implements BowlingGame {

    private BowlingGameConfig config;

    private BowlingGameScoringProcessor processor;

    private BowlingGameScoringState state;

    public BowlingGameImpl(BowlingGameConfig config, BowlingGameScoringProcessor processor) {
        this.config = config;
        this.processor = processor;
        this.state = new BowlingGameScoringState(config);
    }

    @Override
    public void roll(int noOfPins) {
        processor.processRules(state, config, noOfPins);
    }

    @Override
    public int score() {
        return state.getCurrentNumOfScore();
    }

    @Override
    public void startNewMatch() {
        this.state = new BowlingGameScoringState(config);
    }
}
