package greedy;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Problem02 {

    /*
        https://codeup.kr/problem.php?id=3120
        - 테스트 : 케이스(혼합)
        - 조건문 순서 배치
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");

        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a == b) {
            System.out.println(0);
            return;
        }

        int cnt = 0;
        while (a != b) {
            cnt++;
            if (a > b) {
                int minusResult1 = a - 1;
                int minusResult2 = a - 5;
                int minusResult3 = a - 10;

                int res1Abs = Math.abs(minusResult1 - b);
                int res2Abs = Math.abs(minusResult2 - b);
                int res3Abs = Math.abs(minusResult3 - b);

                int minAbs = IntStream.of(res1Abs, res2Abs, res3Abs).min().getAsInt();
                int res = 0;
                if (minAbs == res1Abs) {
                    res = minusResult1;
                }

                if (minAbs == res2Abs) {
                    res = minusResult2;
                }

                if (minAbs == res3Abs) {
                    res = minusResult3;
                }

                a = res;
            } else if (a < b) {
                int plusResult1 = a + 1;
                int plusResult2 = a + 5;
                int plusResult3 = a + 10;

                int res1Abs = Math.abs(plusResult1 - b);
                int res2Abs = Math.abs(plusResult2 - b);
                int res3Abs = Math.abs(plusResult3 - b);

                int minAbs = IntStream.of(res1Abs, res2Abs, res3Abs).min().getAsInt();
                int res = 0;
                if (minAbs == res1Abs) {
                    res = plusResult1;
                }

                if (minAbs == res2Abs) {
                    res = plusResult2;
                }

                if (minAbs == res3Abs) {
                    res = plusResult3;
                }

                a = res;
            } else {
            }
        }

        System.out.println(cnt);
    }
}