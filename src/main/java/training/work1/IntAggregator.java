package training.work1;

import lombok.Builder;
import lombok.Value;
import training.NumberAggregator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 整数リストを使った集計をするクラスです。
 * 以下を目的とした演習をします。
 * <ul>
 *     <li>IntegerをStream()を使って実装できること。</li>
 *     <li>Stream()を使って、最大値、最小値等の値を求められること。</li>
 * </ul>
 */
@Builder
@Value
public class IntAggregator implements NumberAggregator<Integer> {
    private List<Integer> intList;

    @Override
    public Optional<Integer> findMinimum() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> findMaximum() {
        // TODO for文からStreamへの書き換え

        Integer retInt = null;
        for (var i : intList) {
            if (retInt == null) {
                retInt = i;
                continue;
            }
            if (retInt < i) {
                retInt = i;
            }
        }
        return Optional.ofNullable(retInt);
    }

    @Override
    public Optional<Integer> findTotal() {
        return Optional.empty();
    }

    @Override
    public Optional<Integer> findAverage() {
        return Optional.empty();
    }

    static class IntAggregatorBuilder {
        private List<Integer> intList = new ArrayList<>();

        static IntAggregatorBuilder builder() {
            return new IntAggregatorBuilder();
        }

        IntAggregatorBuilder append(Integer... ints) {
            Arrays.stream(ints).sequential().forEach(intList::add);
            return this;
        }
    }
}
