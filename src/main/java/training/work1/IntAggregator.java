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
    private List<Integer> numList;

    @Override
    public Optional<Integer> findMinimum() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    @Override
    public Optional<Integer> findMaximum() {
        // TODO for文からStreamへの書き換え

        Integer retInt = null;
        for (var i : numList) {
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
        // TODO 実装とテスト
        return Optional.empty();
    }

    @Override
    public Optional<Integer> findAverage() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    static class IntAggregatorBuilder {
        private List<Integer> numList = new ArrayList<>();

        static IntAggregatorBuilder builder() {
            return new IntAggregatorBuilder();
        }

        IntAggregatorBuilder append(Integer... ints) {
            Arrays.stream(ints).sequential().forEach(numList::add);
            return this;
        }
    }
}
