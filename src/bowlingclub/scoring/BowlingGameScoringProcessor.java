package bowlingclub.scoring;

import bowlingclub.BowlingGameConfig;

/**
 * The core scoring processor responsible for processing rules with the given scoring context, configuration
 * and number of pins for the roll.
 *
 * Created by henry on 24/05/2014.
 */
public interface BowlingGameScoringProcessor {

    public void processRules(BowlingGameScoringState state, BowlingGameConfig config, int noOfPins);


}
