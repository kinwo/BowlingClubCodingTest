package bowlingclub.scoring;

import bowlingclub.BowlingGameConfig;

/**
 * Bowling game frame domain model
 *
 * Created by henry on 24/05/2014.
 */
public class BowlingGameFrame {

    private int frameLevel = 0;

    private int numOfRemainingTries = 0;

    private int numOfRemainingBowls = 0;

    private int frameScore = 0;


    public BowlingGameFrame(BowlingGameConfig config) {
        this.numOfRemainingTries = config.getNumOfTriesInFrame();
    }

    public boolean hasReachMaxTriesAndBowls() {
        return numOfRemainingTries == 0 && numOfRemainingBowls == 0;
    }

    public void incrementOneFrameLevel(BowlingGameConfig config, BowlingGameScoringState state) {
        if (frameLevel < config.getNumOfFramesInMatch()) {
            state.addScore(frameScore);
            frameLevel++;
            numOfRemainingTries = config.getNumOfTriesInFrame();
            numOfRemainingBowls = 0;
            frameScore = 0;
        }
    }

    public void addFrameScore(int score) {
        frameScore += score;
    }

    public int getNumOfRemainingBowls() {
        return numOfRemainingBowls;
    }

    public void setNumOfRemainingBowls(int numOfRemainingBowls) {
        this.numOfRemainingBowls = numOfRemainingBowls;
    }

    public int getNumOfRemainingTries() {
        return numOfRemainingTries;
    }

    public void setNumOfRemainingTries(int numOfRemainingTries) {
        this.numOfRemainingTries = numOfRemainingTries;
    }

    public int getFrameLevel() {
        return frameLevel;
    }

    public void setFrameLevel(int frameLevel) {
        this.frameLevel = frameLevel;
    }

    public int getFrameScore() {
        return frameScore;
    }

    public void setFrameScore(int frameScore) {
        this.frameScore = frameScore;
    }

    public void decrementRetriesOrBowls() {
        if (numOfRemainingTries > 0) {
            numOfRemainingTries--;
        } else if (numOfRemainingBowls > 0) {
            numOfRemainingBowls--;
        }
    }
}
