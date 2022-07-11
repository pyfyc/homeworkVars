public class Main {
    public static void main(String[] args) {
        // Task 1
        byte tasks = 5;
        short hours = 25000;
        int salary = 85700;
        long seconds = 123456789L;

        float temperature = 36.5f;
        double pi = 3.14;

        char symbol = 'a';
        boolean flag = true;

        // Task 2
        float fighter1Weight = 78.2f;
        float fighter2Weight = 82.7f;

        float totalWeight = fighter1Weight + fighter2Weight;
        System.out.println("Общий вес двух бойцов: " + totalWeight + " кг.");

        float weightDiff = fighter2Weight - fighter1Weight;
        System.out.println("Разница между весами: " + weightDiff + " кг.");

        // Task 3
        byte banana = 80;
        byte milk = 105;
        byte icecream = 100;
        byte egg = 70;

        int breakfastGramms = (5 * banana) + (2 * milk) + (2 * icecream) + (4 * egg);
        System.out.println("Вес спорт-завтрака: " + breakfastGramms + " грамм");
        System.out.println("Вес спорт-завтрака: " + breakfastGramms / 1000 + " кг. и " + breakfastGramms % 1000 + " грамм");

        // Task 4
        byte days250 = 7000 / 250;
        byte days500 = 7000 / 500;

        System.out.println("Если худеть по 250 г. в день, то 7 кг. можно сбросить за " + days250 + " дней.");
        System.out.println("Если худеть по 500 г. в день, то 7 кг. можно сбросить за " + days500 + " дней.");
        System.out.println("В среднем похудеть можно за " + (days250 + days500) / 2 + " дней.");

        // Task 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        int salaryMashaInc = salaryMasha + salaryMasha / 10;
        int salaryDenisInc = salaryDenis + salaryDenis / 10;
        int salaryKristinaInc = salaryKristina + salaryKristina / 10;

        int salaryMashaYear = salaryMasha * 12;
        int salaryDenisYear = salaryDenis * 12;
        int salaryKristinaYear = salaryKristina * 12;

        int salaryMashaYearInc = salaryMashaInc * 12;
        int salaryDenisYearInc = salaryDenisInc * 12;
        int salaryKristinaYearInc = salaryKristinaInc * 12;

        System.out.println("Маша теперь получает " + salaryMashaInc + " рублей/месяц. " +
                "Годовой доход вырос на " + (salaryMashaYearInc - salaryMashaYear) + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisInc + " рублей/месяц. " +
                "Годовой доход вырос на " + (salaryDenisYearInc - salaryDenisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaInc + " рублей/месяц. " +
                "Годовой доход вырос на " + (salaryKristinaYearInc - salaryKristinaYear) + " рублей.");
    }
}