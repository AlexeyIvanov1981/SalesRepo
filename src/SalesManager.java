public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int avg() {
        int avg;
        int sum = 0;
        for (int x : sales) {
            if (x != getMax(sales) && x != getMin(sales)) {
                sum += x;
            }
        }
        return avg = sum / (sales.length - 2);
    }

    private static int getMax(int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i : A) {
            max = Math.max(max, i);
        }
        return max;
    }

    private static int getMin(int[] A) {
        int min = Integer.MAX_VALUE;
        for (int i : A) {
            min = Math.min(min, i);
        }
        return min;
    }

}
