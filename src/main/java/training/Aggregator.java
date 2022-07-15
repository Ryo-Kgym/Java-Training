package training;

import java.util.Optional;

public interface Aggregator<T> {

    /**
     * リストの中で最小の値を返します。
     *
     * @return 最小値
     */
    Optional<T> findMinimum();

    /**
     * リストの中で最大の値を返します。
     *
     * @return 最大値
     */
    Optional<T> findMaximum();

    /**
     * リストの合計値を返します。
     *
     * @return 合計値
     */
    Optional<T> findTotal();

    /**
     * リストの平均値を返します。
     *
     * @return 平均値
     */
    Optional<T> findAverage();
}
