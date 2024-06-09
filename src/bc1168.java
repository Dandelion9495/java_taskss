import java.util.Scanner;

public class bc1168 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] leds = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            String number = input.nextLine();
            int total = 0;
            for (char digit : number.toCharArray()) {
                total += leds[Character.getNumericValue(digit)];
            }
            System.out.println(total + " leds");
        }

        input.close();
    }
}