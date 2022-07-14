package training.work1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IntAggregatorTest {

    @ParameterizedTest(name = "case {index}: {0}")
    @MethodSource("getMaxProvider")
    void getMax(String caseName, IntAggregator src, Integer expected) {
        var actual = src.findMaximum();

        assertThat(actual, is(expected));
    }

    private static Stream<Arguments> getMaxProvider() {
        return Stream.of(
                Arguments.of(
                        "リストが空の場合",
                        IntAggregator.builder()
                                .build(),
                        null
                ),
                Arguments.of(
                        "リストが空でない場合",
                        IntAggregator.builder()
                                .intList(List.of(-1, 2, -6, 4, 7, 1, 4))
                                .build(),
                        7
                )
        );
    }

    @Test
    void append() {
        var src = IntAggregator.builder()
                .append(2)
                .append(-4)
                .append(9)
                .append(3)
                .build();
        var actual = src.getIntList();
        var expected = List.of(2, -4, 9, 3);

        assertThat(actual, is(expected));
    }

}