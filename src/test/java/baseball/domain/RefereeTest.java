package baseball.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class RefereeTest {
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);
    private Referee referee;

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @Test
    void threeStrike() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0볼 3스트라이크");
    }

    @Test
    void nothing() {
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void threeBall() {
        String result = referee.compare(ANSWER, Arrays.asList(3, 1, 2));
        assertThat(result).isEqualTo("3볼 0스트라이크");
    }
}