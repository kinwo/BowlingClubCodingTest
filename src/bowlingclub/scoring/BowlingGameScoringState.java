package bowlingclub.scoring;

import bowlingclub.BowlingGameConfig;

/**
 * Bowling game scoring context object keeping track of the state of the game including:
 *
 * - Current frame level, score
 *
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
