package leetcode_solved;

public class LastWordLength {

    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new LastWordLength().lengthOfLastWord("Hello World"));
        System.out.println(new LastWordLength().lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(new LastWordLength().lengthOfLastWord("luffy is still joyboy"));
    }
}
