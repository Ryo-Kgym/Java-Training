package training;

public interface Aggregator<T> {

    /**
     * リストの中で最小の値を返します。
     *
     * @return 最小値
     */
    T findMinimum();

    /**
     * リストの中で最大の値を返します。
     *
     * @return 最大値
     */
    T findMaximum();

    /**
     * リストの合計値を返します。
     *
     * @return 合計値
     */
    T findTotal();

    /**
     * リストの平均値を返します。
     *
     * @return 平均値
     */
    T findAverage();
}
