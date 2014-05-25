package bowlingclub;

/**
 * Created by henry on 24/05/2014.
 */
public class BowlingGameConfig {

    private int numOfFramesInMatch = 0;

    private int numOfPinsInFrame = 0;

    private int numOfTriesInFrame = 0;

    public BowlingGameConfig(int numOfFramesInMatch, int numOfPinsInFrame, int numOfTriesInFrame) {
        this.numOfFramesInMatch = numOfFramesInMatch;
        this.numOfPinsInFrame = numOfPinsInFrame;
        this.numOfTriesInFrame = numOfTriesInFrame;
    }

    public int getNumOfFramesInMatch() {
        return numOfFramesInMatch;
    }

    public int getNumOfPinsInFrame() {
        return numOfPinsInFrame;
    }

    public int getNumOfTriesInFrame() {
        return numOfTriesInFrame;
    }
}
