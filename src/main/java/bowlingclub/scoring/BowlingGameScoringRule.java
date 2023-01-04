package bowlingclub.scoring;

import bowlingclub.scoring.impl.BowlingGameScoringIteration;

/**
 * Common Bowling game scoring rule interface
 *
 * Created by henry on 24/05/2014.
 */
public interface BowlingGameScoringRule {

    public void runRule(BowlingGameScoringIteration iteration);

}
