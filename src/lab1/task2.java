package lab1;

public class task2 {
    public static void main(String[] args) {
        String[] actions = {"Like", "Dislike", "Dislike", "Like", "Like"};
        String state = "Nothing";
        for (String action : actions) {
            if (action.equals(state)) {
                state = "Nothing";
            } else {
                state = action;
            }
        }
        System.out.println(state);
    }
}