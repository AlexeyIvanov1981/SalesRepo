import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalesTestClass {

    SalesManager sales = new SalesManager(new long[]{1, 20, 50, 90, 110});

    @Test
    public void maxSilesTest(){
        long result = sales.max();
        Assertions.assertEquals(110, result);
    }
    @Test
    public void avgSilesTest(){
        long result = sales.avg();
        Assertions.assertEquals(53, result);
    }

    @Test
    public void minSalesTest(){
        long result = sales.min();
        Assertions.assertEquals(1, result);
    }
}
