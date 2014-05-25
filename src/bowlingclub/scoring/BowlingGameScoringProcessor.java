package bowlingclub.scoring;

import bowlingclub.BowlingGameConfig;

/**
 * Created by henry on 24/05/2014.
 */
public interface BowlingGameScoringProcessor {

    public void processRules(BowlingGameScoringState state, BowlingGameConfig config, int noOfPins);


}
