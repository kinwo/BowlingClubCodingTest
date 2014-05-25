package bowlingclub.scoring;

import bowlingclub.BowlingGameConfig;

/**
 * Created by henry on 24/05/2014.
 */
public class BowlingGameScoringState {

    private int currentNumOfScore = 0;

    private BowlingGameFrame frame;

    public BowlingGameScoringState(BowlingGameConfig config) {
        this.frame = new BowlingGameFrame(config);
    }

    public void addScore(int score) {
        this.currentNumOfScore += score;
    }

    public int getCurrentNumOfScore() {
        return currentNumOfScore;
    }

    public BowlingGameFrame getFrame() {
        return frame;
    }
}
