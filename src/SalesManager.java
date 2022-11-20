public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long avg() {
        long avg;
        long sum = 0;
        for (long x : sales) {
            sum += x;
            }
        return avg = (sum - (getMax(sales) + getMin(sales))) / (sales.length - 2);
    }

    private long getMax(long[] A) {
        long max = Long.MIN_VALUE;
        for (long i : A) {
            max = Math.max(max, i);
        }
        return max;
    }

    private long getMin(long[] A) {
        long min = Long.MAX_VALUE;
        for (long i : A) {
            min = Math.min(min, i);
        }
        return min;
    }

}
