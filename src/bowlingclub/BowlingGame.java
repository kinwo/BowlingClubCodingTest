package bowlingclub;

/**
 * Bowling Game Interface
 *
 * Created by henry on 24/05/2014.
 */
public interface BowlingGame {

    public void roll(int noOfPins);

    public int score();

    public void startNewMatch();

}
