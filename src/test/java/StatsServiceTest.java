package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldCalculateAllSales() {        // Тест 1
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAll = 180;
        int actualAll = service.sumSales(sales);
        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test                                        // Тест 2
    public void shouldAveragePerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averagePerMonth(sales);

        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test                                     // Тест 3
    public void shouldMaxSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSalesPerMonth(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void shouldMinSalesPerMonth() {         // Тест 4
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldBelowAverage() {             // Тест 5
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedBelowAverage = 5;
        int actualBelowAverage = service.belowAverage(sales);

        Assertions.assertEquals(expectedBelowAverage, actualBelowAverage);
    }

    @Test
    public void shouldAboveAverage() {              // Тест 6
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAboveAverage = 5;
        int actualAboveAverage = service.aboveAverage(sales);

        Assertions.assertEquals(expectedAboveAverage, actualAboveAverage);


    }

}
