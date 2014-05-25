package bowlingclub.scoring.rules;

import bowlingclub.scoring.BowlingGameFrame;
import bowlingclub.scoring.BowlingGameScoringRule;
import bowlingclub.scoring.impl.BowlingGameScoringIteration;

/**
 * Created by henry on 24/05/2014.
 */
public class BowlingGameRuleNormalScore implements BowlingGameScoringRule {

    @Override
    public void runRule(BowlingGameScoringIteration iteration) {
        BowlingGameFrame frame = iteration.getState().getFrame();
        frame.addFrameScore(iteration.getNoOfPins());
    }

}
