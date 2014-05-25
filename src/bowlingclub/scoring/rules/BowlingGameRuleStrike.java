package bowlingclub.scoring.rules;

import bowlingclub.BowlingGameConfig;
import bowlingclub.scoring.BowlingGameFrame;
import bowlingclub.scoring.BowlingGameScoringRule;
import bowlingclub.scoring.BowlingGameScoringState;
import bowlingclub.scoring.impl.BowlingGameScoringIteration;

/**
 * Bowling game rule for Strike
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameRuleStrike implements BowlingGameScoringRule {

    @Override
    public void runRule(BowlingGameScoringIteration iteration) {
        int noOfPins = iteration.getNoOfPins();
        BowlingGameScoringState state = iteration.getState();
        BowlingGameConfig config = iteration.getConfig();
        BowlingGameFrame frame = state.getFrame();

        if (noOfPins == config.getNumOfPinsInFrame() && frame.getNumOfRemainingTries() == 2) {
            frame.setNumOfRemainingBowls(2);
            frame.setNumOfRemainingTries(1);
        } else if (noOfPins == config.getNumOfPinsInFrame() && frame.getNumOfRemainingTries() == 0
                && frame.getNumOfRemainingBowls() == 2) {
            frame.setNumOfRemainingBowls(1);
        }
    }

}
