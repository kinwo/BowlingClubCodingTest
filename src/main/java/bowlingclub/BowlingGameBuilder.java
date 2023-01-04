package bowlingclub;

import bowlingclub.impl.BowlingGameImpl;
import bowlingclub.scoring.BowlingGameScoringProcessor;
import bowlingclub.scoring.BowlingGameScoringRule;
import bowlingclub.scoring.impl.BowlingGameScoringProcessorImpl;
import bowlingclub.scoring.rules.BowlingGameRuleBowlExtraScore;
import bowlingclub.scoring.rules.BowlingGameRuleNormalScore;
import bowlingclub.scoring.rules.BowlingGameRuleSpare;
import bowlingclub.scoring.rules.BowlingGameRuleStrike;

import java.util.ArrayList;
import java.util.List;

/**
 * A Bowling game helper class to quickly create a basic BowlingGame instance composed of
 *
 * - BowlingGameConfig, list of BowlingGameScoringRule, BowlingGameScoringProcessor
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameBuilder {

    private static final BowlingGameBuilder builder = new BowlingGameBuilder();

    public static BowlingGameBuilder instance() {
        return builder;
    }

    public BowlingGame buildBasicGame(int numOfFramesInMatch, int numOfPinsInFrame, int numOfTriesInFrame) {
        BowlingGameConfig config = new BowlingGameConfig(numOfFramesInMatch, numOfPinsInFrame, numOfTriesInFrame);
        List<BowlingGameScoringRule> rules = createBowlingGameScoringRules();

        BowlingGameScoringProcessor processor = new BowlingGameScoringProcessorImpl(rules);
        BowlingGame game = new BowlingGameImpl(config, processor);
        return game;
    }

    private List<BowlingGameScoringRule> createBowlingGameScoringRules() {
        // this is a list because order of rules is mattered
        List<BowlingGameScoringRule> rules = new ArrayList<BowlingGameScoringRule>();
        rules.add(new BowlingGameRuleStrike());
        rules.add(new BowlingGameRuleSpare());
        rules.add(new BowlingGameRuleNormalScore());
        rules.add(new BowlingGameRuleBowlExtraScore());
        return rules;
    }
}
