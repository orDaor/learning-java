public class StringVariables {

    public static void main(String[] args) {
        System.out.println("JOIN STRINGS WITH + SYMBOL-------");
        String sentence1 = "My name is: ";
        String name = "Orgher";
        String completeSentence = sentence1 +  name;
        System.out.println(completeSentence);

        System.out.println("JOIN STRING AND OTHER VALUES------------------------------------------");
        String sentence2 = "Number of players is: ";
        int players = 0;
        players += 5;
        System.out.println(sentence2 + players);
        players -= 2;
        System.out.println(sentence2 + players);
    }
}