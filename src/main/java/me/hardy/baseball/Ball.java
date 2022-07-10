package me.hardy.baseball;

public class Ball {
    private int position;
    private int ballNo;

    public Ball(int position, int ballNo) {
        this.position = position;
        this.ballNo = ballNo;
    }

    public BallStatus play(Ball user) {
        if (position != user.position && ballNo != user.ballNo) {
            return BallStatus.NOTHING;
        }
        return null;
    }
}
