import java.util.Scanner;

public class bc1516{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            if (N == 0 && M == 0) break;
            String[] drawing = new String[N];
            for (int i = 0; i < N; i++) {
                drawing[i] = scanner.next();
            }
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int rowScale = A / N;
            int colScale = B / M;
            StringBuilder output = new StringBuilder();

            for (int i = 0; i < N; i++) {
                for (int r = 0; r < rowScale; r++) {
                    for (int j = 0; j < M; j++) {
                        for (int c = 0; c < colScale; c++) {
                            output.append(drawing[i].charAt(j));
                        }
                    }
                    output.append("\n");
                }
            }
            System.out.print(output.toString());
            System.out.println();
        }

        scanner.close();
    }
}