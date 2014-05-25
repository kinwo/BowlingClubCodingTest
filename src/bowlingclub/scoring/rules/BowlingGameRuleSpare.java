package bowlingclub.scoring.rules;

import bowlingclub.BowlingGameConfig;
import bowlingclub.scoring.BowlingGameFrame;
import bowlingclub.scoring.BowlingGameScoringRule;
import bowlingclub.scoring.BowlingGameScoringState;
import bowlingclub.scoring.impl.BowlingGameScoringIteration;

/**
 * Created by henry on 24/05/2014.
 */
public class BowlingGameRuleSpare implements BowlingGameScoringRule {

    @Override
    public void runRule(BowlingGameScoringIteration iteration) {
        int noOfPins = iteration.getNoOfPins();
        BowlingGameScoringState state = iteration.getState();
        BowlingGameConfig config = iteration.getConfig();
        BowlingGameFrame frame = state.getFrame();

        if ((noOfPins + frame.getFrameScore()) == config.getNumOfPinsInFrame() && frame.getNumOfRemainingTries() == 1
                && frame.getNumOfRemainingBowls() == 0) {
            iteration.getState().getFrame().setNumOfRemainingBowls(1);
        }
    }

}
