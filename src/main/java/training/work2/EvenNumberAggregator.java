package training.work2;

import lombok.Builder;
import lombok.Value;
import training.NumberAggregator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * 整数リストを使った集計をするクラスです。
 * 以下を目的とした演習をします。
 * <ul>
 *     <li>Stream().filter()を使って偶数を抽出すること。</li>
 * </ul>
 */
@Builder
@Value
public class EvenNumberAggregator implements NumberAggregator<Integer> {
    private List<Integer> numList;


    /**
     * リストの中で最小の偶数を返します。
     * 当該データが存在しない場合は、NULLを返します。
     *
     * @return 偶数の最小値
     */
    @Override
    public Optional<Integer> findMinimum() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    /**
     * リストの中で最大の偶数を返します。
     * 当該データが存在しない場合は、NULLを返します。
     *
     * @return 偶数の最大値
     */
    @Override
    public Optional<Integer> findMaximum() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    /**
     * リストの中で偶数の合計を返します。
     * 当該データが存在しない場合は、NULLを返します。
     *
     * @return 偶数の合計値
     */
    @Override
    public Optional<Integer> findTotal() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    /**
     * リストの中で偶数の平均を返します。
     * 当該データが存在しない場合は、NULLを返します。
     *
     * @return 偶数の平均値
     */
    @Override
    public Optional<Integer> findAverage() {
        // TODO 実装とテスト
        return Optional.empty();
    }

    static class EvenNumberAggregatorBuilder {
        private List<Integer> numList = new ArrayList<>();

        static EvenNumberAggregatorBuilder builder() {
            return new EvenNumberAggregatorBuilder();
        }
    }
}
