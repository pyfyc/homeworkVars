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
    }
}