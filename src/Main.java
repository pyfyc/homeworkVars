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

        float weightDiff = Math.abs(fighter1Weight - fighter2Weight);
        System.out.println("Разница между весами: " + weightDiff + " кг.");

        // Task 3
        int banana = 5;
        int bananaWeight = 80;

        int milk = 200 / 100;
        int milkWeight = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int egg = 4;
        int eggWeight = 70;

        int breakfastGramms = (banana * bananaWeight) + (milk * milkWeight) + (iceCream * iceCreamWeight) + (egg * eggWeight);
        int gramsInKg = 1000;
        double breakfastKgs = breakfastGramms / (gramsInKg * 1.0);

        System.out.println("Вес спорт-завтрака: " + breakfastGramms + " грамм.");
        System.out.println("Вес спорт-завтрака: " + breakfastKgs + " кг.");

        // Task 4
        int weight = 7;
        int weightInGrams = weight * gramsInKg;

        int minGramsPerDay = 250;
        int maxGramsPerDay = 500;

        int minDays = weightInGrams / minGramsPerDay;
        int maxDays = weightInGrams / maxGramsPerDay;
        int avgDays = (minDays + maxDays) / 2;

        System.out.println("Если худеть по 250 г. в день, то 7 кг. можно сбросить за " + maxDays + " дней.");
        System.out.println("Если худеть по 500 г. в день, то 7 кг. можно сбросить за " + minDays + " дней.");
        System.out.println("В среднем похудеть можно за " + avgDays + " дней.");

        // Task 5
        int percent = 10;
        double multiplier = percent / (100 * 1.0);

        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryKristina = 76_230;

        int salaryMashaInc = (int) (salaryMasha + salaryMasha * multiplier);
        int salaryDenisInc = (int) (salaryDenis + salaryDenis * multiplier);
        int salaryKristinaInc = (int) (salaryKristina + salaryKristina * multiplier);

        int salaryMashaDiff = (salaryMashaInc - salaryMasha) * 12;
        int salaryDenisDiff = (salaryDenisInc - salaryDenis) * 12;
        int salaryKristinaDiff = (salaryKristinaInc - salaryKristina) * 12;

        System.out.println("Маша теперь получает " + salaryMashaInc + " рублей/месяц. Годовой доход вырос на " + salaryMashaDiff + " рублей.");
        System.out.println("Денис теперь получает " + salaryDenisInc + " рублей/месяц. Годовой доход вырос на " + salaryDenisDiff + " рублей.");
        System.out.println("Кристина теперь получает " + salaryKristinaInc + " рублей/месяц. Годовой доход вырос на " + salaryKristinaDiff + " рублей.");
    }
}