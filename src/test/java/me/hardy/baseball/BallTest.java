package me.hardy.baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BallTest {

    @Test
    public void nothing() {
        Ball com = new Ball(1, 1);
        assertThat(com.play(new Ball(2, 4))).isEqualTo(BallStatus.NOTHING);
    }
}
