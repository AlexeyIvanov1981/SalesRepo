public class Main {
    public static void main(String[] args) {
        SalesManager sales = new SalesManager(new long[]{1, 20, 50, 90, 110});
        System.out.println("max sales - " + sales.max());
        System.out.println("avg sales - " + sales.avg());
        System.out.println("min sales - " + sales.min());
    }
}
