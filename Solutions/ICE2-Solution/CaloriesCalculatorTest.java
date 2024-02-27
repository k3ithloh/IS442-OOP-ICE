public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        NewYearGoodie tart =  new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);

        //b
        System.out.printf("Pineapple Tarts more sinful than Bak Kwa: %s\n", tart.isMoreSinful(bakKwa));

        System.out.println();

        //c
        System.out.printf("%s (calories per gram): %.2f\n", tart.getName(), tart.getCaloriesPerGram());
        System.out.printf("%s (calories per gram): %.2f\n", bakKwa.getName(), bakKwa.getCaloriesPerGram());
        System.out.printf("%s (calories per gram): %.2f\n", loveLetters.getName(), loveLetters.getCaloriesPerGram());

        System.out.println();
        //d
        CaloriesCalculator calc = new CaloriesCalculator();

        //e
        calc.addNewYearGoodie(tart, 2);
        calc.addNewYearGoodie(bakKwa, 3);
        calc.addNewYearGoodie(loveLetters, 5);

        System.out.printf("Total Calories: %.2f\n", calc.getTotalCalories());

        //f
        System.out.printf("Most sinful goodie: %s\n", calc.getMostSinfulGoodie().getName());
    }
}
