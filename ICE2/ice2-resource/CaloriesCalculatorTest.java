public class CaloriesCalculatorTest {
    public static void main(String[] args) {
        // * Question 3A
        NewYearGoodie tart = new NewYearGoodie("Pineapple Tarts", 82.5, 20);
        NewYearGoodie bakKwa = new NewYearGoodie("Bak Kwa", 115, 28);
        NewYearGoodie loveLetters = new NewYearGoodie("Love Letters", 56.5, 13);
        

        // * Question 3B
        boolean result;
        if (tart.isMoreSinful(bakKwa)){
           result = true;
        }
        else{
            result = false;
        }
         System.out.printf("%s is more sinful than %s: %b\n", tart.getName(), bakKwa.getName(), result);
         System.out.println("");

        // * Question 3C
        System.out.printf("%s (calories per gram) :%.2f\n", tart.getName(), tart.getCaloriesPerGram());
        System.out.printf("%s (calories per gram) :%.2f\n", bakKwa.getName(), bakKwa.getCaloriesPerGram());
        System.out.printf("%s (calories per gram) :%.2f\n", loveLetters.getName(), loveLetters.getCaloriesPerGram());

        // * Question 3D
        CaloriesCalculator calCalculator = new CaloriesCalculator();
        // System.out.println(calCalculator.toString());

        // * Question 3E
        calCalculator.addNewYearGoodie(tart, 2);
        calCalculator.addNewYearGoodie(bakKwa, 3);
        calCalculator.addNewYearGoodie(loveLetters, 5);
        System.out.printf("Total Calories :%.2f\n",calCalculator.getTotalCalories());

        // * Question 3F
        NewYearGoodie mostSinful = calCalculator.getMostSinfulGoodie();
        System.out.printf("Most sinful goodie :%s\n",mostSinful.getName());
    }
}