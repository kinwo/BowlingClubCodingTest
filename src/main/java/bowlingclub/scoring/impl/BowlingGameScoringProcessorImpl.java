package bowlingclub.scoring.impl;

import bowlingclub.BowlingGameConfig;
import bowlingclub.scoring.BowlingGameFrame;
import bowlingclub.scoring.BowlingGameScoringProcessor;
import bowlingclub.scoring.BowlingGameScoringRule;
import bowlingclub.scoring.BowlingGameScoringState;

import java.util.ArrayList;
import java.util.List;

/**
 * The implementation of BowlingGameScoringProcessor responsible to process the number of pins using the list of rules.
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameScoringProcessorImpl implements BowlingGameScoringProcessor {

    private List<BowlingGameScoringRule> rules = new ArrayList<BowlingGameScoringRule>();

    public BowlingGameScoringProcessorImpl(List<BowlingGameScoringRule> rules) {
        this.rules.addAll(rules);
    }

    public void addRule(BowlingGameScoringRule rule) {
        this.rules.add(rule);
    }

    @Override
    public void processRules(BowlingGameScoringState state, BowlingGameConfig config, int noOfPins) {
        // process no more if reached max frames
        if (state.getFrame().getFrameLevel() >= config.getNumOfFramesInMatch()) {
            return;
        }

        BowlingGameScoringIteration iteration = new BowlingGameScoringIteration(state, config, noOfPins);
        BowlingGameFrame frame = state.getFrame();

        for (BowlingGameScoringRule rule : rules) {
            rule.runRule(iteration);
        }

        frame.decrementRetriesOrBowls();

        // increment frame level
        if (frame.hasReachMaxTriesAndBowls()) {
            frame.incrementOneFrameLevel(config, state);
        }

    }
}
