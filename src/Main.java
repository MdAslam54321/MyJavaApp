public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        String sentence = "Jackie Chan is the best hollywood actor";
        System.out.println(sentence);
        String reversedWords = t.reverseEachWord(sentence);
        System.out.println(reversedWords);
    }
}