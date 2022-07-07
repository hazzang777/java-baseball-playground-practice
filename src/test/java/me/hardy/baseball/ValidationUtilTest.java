package me.hardy.baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationUtilTest {

    @Test
    @DisplayName("1부터 9사이의 숫자인지 체크")
    public void oneToNineCheck() {
        assertThat(ValidationUtil.checkOneToNine(1)).isTrue();
        assertThat(ValidationUtil.checkOneToNine(0)).isFalse();
        assertThat(ValidationUtil.checkOneToNine(3)).isTrue();
        assertThat(ValidationUtil.checkOneToNine(9)).isTrue();
    }
}
