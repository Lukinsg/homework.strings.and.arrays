package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {       // Метод 1 "Сумма всех продаж"
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averagePerMonth(long[] sales) { // Метод 2 "Средняя сумма продаж в месяц"
        int average = sumSales(sales) / sales.length;

        return average;
    }

    public int maxSalesPerMonth(long[] sales) { // Метод 3  "Месяц с наибольшими продажами"
        int maxMonth = 0;
        int month = 0;

        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {           // Метод 4  "Месяц с наименьшими продажами"
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int belowAverage(long[] sales) {  // Метод 5 "Кол-во мес., в которых продажи ниже среднего"
        int below = 0;
        for (long sale : sales) {
            if (sale < averagePerMonth(sales)) {
                below = below + 1;
            }

        }
        return below;
    }

    public int aboveAverage(long[] sales) {   // Метод 6 "Кол-во мес., в которых продажи выше среднего"
        int above = 0;
        for (long sale : sales) {
            if (sale > averagePerMonth(sales)) {
                above = above + 1;
            }

        }
        return above;
    }
}






