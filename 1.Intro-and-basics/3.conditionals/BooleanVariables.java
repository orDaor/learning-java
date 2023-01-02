/**
 * Booleans
 */
public class BooleanVariables {

    public static void main(String[] args) {
        
        //NUMBERS valuse
        int biologyGrade = 8;
        int historyGrade = 10;
        boolean iAmBetterAtHistory = historyGrade > biologyGrade;
        System.out.println("iAmBetterAtHistory: " + iAmBetterAtHistory);

        double costs = 55.99;
        double sales = 101;
        boolean isProfit = costs < sales;
        System.out.println("isProfit: " + isProfit);

        double level1 = 1.0;
        double level2 = 1.0;
        boolean reachedLevel2 = level1 >= level2;
        System.out.println("reachedLevel2: " + reachedLevel2);

        int age1 = 17;
        double age2 = 17.1;
        boolean isSameAge = age1 == age2;
        boolean isDifferentAge = age1 != age2;
        System.out.println("isSameAge: " + isSameAge);
        System.out.println("isDifferentAge: " + isDifferentAge);

        //STRINGS values
        String sentence1 = "Hey you bitch!";
        String sentence2 = "Hey you bitch";
        boolean stringsAreEqual = sentence1.equals(sentence2);
        boolean stringsAreNOTEqual = !sentence1.equals(sentence2);
        System.out.println("stringsAreEqual: " + stringsAreEqual);
        System.out.println("stringsAreNOTEqual: " + stringsAreNOTEqual);

        System.out.println("3.6 to INT: " + (int)3.6);
    }
    
}