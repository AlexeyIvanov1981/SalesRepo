public class Main {
    public static void main(String[] args) {
        SalesManager sales = new SalesManager(new int[]{1, 20, 50, 90, 110});
        System.out.println("max sales - " + sales.max());
    }
}
